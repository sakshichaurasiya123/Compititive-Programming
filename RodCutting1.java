/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	   Scanner in=new Scanner(System.in);
	   int n=in.nextInt();
	   int arr[]=new int[n];
	   for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	    rodCutting(arr,n);
	}
	static void rodCutting(int arr[],int n){
	    int dp[][]=new int[n+1][n+1];
	    for(int i=0; i<=n; i++){
	        dp[0][i]=0;
	        dp[i][0]=0;
	    }
	   for(int i=1; i<=n; i++){
	       for(int j=1; j<=n; j++){
	           if(j<i)
	            dp[i][j]=dp[i-1][j];
	           else
	            dp[i][j]=Math.max(arr[i-1]+dp[i][j-i], dp[i-1][j]);
	       }
	   }
	   for(int i=0; i<=n; i++){
	       for(int j=0; j<=n; j++)
	            System.out.print(dp[i][j]+" ");
	       System.out.println();
	   }
	   System.out.println(dp[n][n]);
	}
}
