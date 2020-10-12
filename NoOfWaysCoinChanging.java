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
		int sum=in.nextInt();
		coinChange(arr,n,sum);
	}
	static void coinChange(int arr[],int n,int sum){
	    int dp[][]=new int[n][sum+1];
	    for(int i=0; i<n; i++)
	        dp[i][0]=1;
	    for(int i=0; i<n; i++){
	        for(int j=1; j<=sum; j++){
	            int include=0;
	            int exclude=0;
	            if(j>=arr[i])
	                include=dp[i][j-arr[i]];
	           if(i>0)
	                exclude=dp[i-1][j];
	        dp[i][j]=include+exclude;
	        }
	    }
	    for(int i=0; i<n; i++){
	        for(int j=0; j<=sum; j++)
	            System.out.print(dp[i][j]+" ");
	       System.out.println();
	    }
	    System.out.println(dp[n-1][sum]);
	}/*
	  public static void coinChange(int[] coins, int sum) {
    int table[]=new int[sum+1];
    table[0]=1;
    for(int i=0; i<coins.length; i++){
        for(int j=0; j<table.length; j++){
            if(coins[i]<=j)
            table[j] +=table[j-coins[i]];
        }
    }
        System.out.println(table[sum]);
	  }*/
}
