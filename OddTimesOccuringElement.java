import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	OddOccuringElement(arr,n);
	}

    static void OddOccuringElement(int arr[],int n){
        Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        for(int i : arr)
            map.put(i,map.getOrDefault(i,0)+1);
            for(Map.Entry<Integer,Integer>lm:map.entrySet()){
                if(lm.getValue()%2!=0)
                    System.out.println(lm.getKey());
                }
    }
}