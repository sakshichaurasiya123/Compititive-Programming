/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		waterDropping(arr,n);
	}
	static void waterDropping(int arr[],int n){
	    int dp[]=new int[n];
	    dp[0]=arr[0];
	    dp[1]=Math.max(dp[0],dp[1]);
	    for(int i=2; i<n; i++){
	        dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
	        dp[i]=Math.max(dp[i],arr[i]);
	    }
	    System.out.println(dp[n-1]);
	}
}
