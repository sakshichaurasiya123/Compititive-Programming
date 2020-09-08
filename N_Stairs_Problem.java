/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	   int n1=staircase(n);
	   System.out.println(n1);
	}
	/*Using Recursion
	static int staircase(int n){
	    if(n==2||n==1)
	        return n;
	   else 
	    return staircase(n-2)+ staircase(n-1);
	}
	    */
	   // using DP
	   static int staircase(int n){
	       int dp[]=new int[n+1];
	       dp[0]=1;
	       dp[1]=dp[0];
	       for(int i=2; i<=n; i++){
	           dp[i]=dp[i-1]+dp[i-2];
	       }
	    return dp[n];
	}
}
