/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int n=in.nextInt();
	        int arr[]=new int[n];
	        for(int i=0; i<n; i++)
	            arr[i]=in.nextInt();
	       longestIncreasing(arr, n);
	    }
	}
	static void longestIncreasing(int arr[],int n){
	    n=arr.length;
	    int dp[]=new int[n];
	    for(int i=0; i<n; i++)
	        dp[i]=1;
	   for(int i=1; i<n; i++){
	       for(int j=0; j<i; j++){
	           if(arr[i]>arr[j])
	            dp[i]=Math.max(dp[i],dp[j]+1);
	       }
	       
	   }
	  for(int i=0; i<n; i++)
	    System.out.print(dp[i] +" ");
	   System.out.println();
	   Arrays.sort(dp);
	   System.out.println(dp[n-1]);
	   
	}
}
