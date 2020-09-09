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
		    String s=in.next();
		      int r= count(s,n);
		      System.out.println(r);
		}
	}
	static int count(String s, int n){
	    int dp[]=new int[n+1];
	    dp[0]=1;
	    if(s.charAt(0)=='0')
	        return 0;
	   dp[1]=1;
	   for(int i=2; i<=n; i++){
	       int c1=0;
	       int c2=0;
	       if(s.charAt(i-1)>'0')
	        c1=dp[i-1];
	       if(s.charAt(i-2)=='1' || s.charAt(i-2)=='2' && s.charAt(i-1)<'7')
	            c2=dp[i-2];
	       dp[i]=c1+c2;
	   }
	   
	   return dp[n];     
	}
}
