/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int a[]=new int[n];
	    for(int i=0; i<n; i++)
	        a[i]=in.nextInt();
	   int dp[]=new int[n];
	   for(int i=0; i<n; i++)
	        dp[i]=1;
	   for(int i=1; i<n; i++){
	       for(int j=0; j<i; j++){
	           if(a[i]<a[j] && dp[i]<dp[j]+1)
	                dp[i]=dp[j]+1;
	       }
	   }
	   int sum=0;
	   for(int i=0; i<n; i++)
	   {
	       sum=Math.max(sum,dp[i]);
	   }
	   System.out.println(sum);
	   for(int i=0; i<n; i++)
	    System.out.print(dp[i]+" ");
	  
	}
}
