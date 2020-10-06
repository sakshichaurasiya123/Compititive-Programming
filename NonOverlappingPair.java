/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Pair{
    int x;
    int y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	nonOverlappingpair(arr,n);
	}
    static void nonOverlappingpair(int arr[],int l){
        Map<Integer,List<Pair>>map=new HashMap<>();
        for(int i=0; i<l-1; i++){
            for(int j=i+1; j<l; j++){
                int sum=arr[i]+arr[j];
                if(map.containsKey(sum)){
                    for(Pair pair: map.get(sum)){
                        int m=pair.x;
                        int n=pair.y;
                    
                    if((m!=i && m!=j)&&(n!=i && n!=j)){
                        System.out.println(arr[i]+"  "+arr[j]+"   i = "+i+"  j= "+j);
                        System.out.println(arr[m]+"  "+arr[n]+"   m = "+m+" n = "+n);
                        return;
                    }
                    }
                }
                map.putIfAbsent(sum,new ArrayList<>());
                map.get(sum).add(new Pair(i,j));
            }
        }
    }
}
