/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int X[]=new int[n];
	for(int i=0; i<n; i++)
	    X[i]=in.nextInt();
	int Y[]=new int[n];
	for(int i=0; i<n; i++)
	    Y[i]=in.nextInt();
	longestPossible(X,Y,n);
	}
	static void longestPossible(int X[],int Y[],int n){
	/*    Arrays.sort(X);
	    Arrays.sort(Y);
	    int count=0;
	    for(int i=0; i<n; i++){
	        if(X[i]==Y[i])
	            count++;
	       else
	            break;
	    }
	  System.out.println(Arrays.toString(X));
	  System.out.println(Arrays.toString(Y));
	   System.out.println(count);*/
	   Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	   map.put(0,-1);
	   int res=0;
	   int sum1=0,sum2=0;
	   for(int j=0; j<n; j++){
	    sum1 +=X[j];
	    System.out.println("Sum1 : "+sum1);
	    sum2 +=Y[j];
	    System.out.println("Sum2 : "+sum2);
	    int diff=sum1-sum2;
	    if(!map.containsKey(diff))
	        map.put(diff,j);
	   else{
	        res=Math.max(res,j-map.get(diff));
	        System.out.println(res);
	   }
	}
	System.out.println(map);
	System.out.println(res);
	}
}
