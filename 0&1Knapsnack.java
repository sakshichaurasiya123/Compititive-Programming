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
		    int W=in.nextInt();
		    int value[]=new int[n];
		    int weight[]=new int[n];
		    for(int i=0; i<n; i++)
		        value[i]=in.nextInt();
		    for(int i=0; i<n; i++)
		        weight[i]=in.nextInt();
		      knapsnack(value,weight,n ,W);
		}
	}
	static void knapsnack(int value[],int weight[],int n, int W){
	    int dp[][]=new int[n+1][W+1];
	    for(int i=0; i<=n; i++)
	        dp[i][0]=0;
	    for(int i=0; i<=W; i++)
	        dp[0][i]=0;
	        for(int i=1; i<=n; i++){
	            for(int j=1; j<=W; j++){
	                if(j<weight[i-1])
	                    dp[i][j]=dp[i-1][j];
	               else
	                dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-weight[i-1]]+value[i-1]);
	            }
	        }
	        /*for(int i=0; i<=n; i++){
	            for(int j=0; j<=W; j++)
	                System.out.print(dp[i][j]);
	           System.out.println();
	        }*/
	        System.out.println(dp[n][W]);
	}
}
