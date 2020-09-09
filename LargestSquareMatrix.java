/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int m=in.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0; i<n; i++)
	{
	    for(int j=0; j<m; j++)
	        arr[i][j]=in.nextInt();
	}
	int max=0;
	int dp[][]=new int[n+1][m+1];
	for(int i=0; i<=n; i++){
	   for(int j=0; j<=m; j++){
	       if(i==0 || j==0)
	        dp[i][j]=0;
	       else if(arr[i-1][j-1]==1){
	           dp[i][j]=1+Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1]);
	           if(dp[i][j]>max)
	            max=dp[i][j];
	       }
	       else
	        dp[i][j]=0;
	   }
	    
	}
	System.out.println(max);
	}

}
