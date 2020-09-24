/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	int dp[]=new int[n];
	for(int i=0; i<n; i++)
	    dp[i]=1;
	 // dp[n-1]=1;
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	   int beg=0;
	 for(int i=n-2; i>=0; i--){
	     for(int j=n-1; j>i; j--){
	         if(arr[j]<arr[i] && dp[i]<dp[j]+1)
	            dp[i]=dp[j]+1;
	         }
    	 }
    	 System.out.println(Arrays.toString(dp));
	}
}
