/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int a=in.nextInt();
	    int b=in.nextInt();
	    String s1=in.next();
	    String s2=in.next();
	    
	   int ar= lcs(a,b,s1,s2);
	   System.out.println(ar);
	}
	static int lcs(int a,int b,String s1,String s2){
	    char s11[]=s1.toCharArray();
	    char s22[]=s2.toCharArray();
	    int dp[][]=new int[a+1][b+1];
	    for(int i=0; i<=a; i++){
	        for(int j=0; j<=b; j++){
	            if(i==0 || j==0)
	                dp[i][j]=0;
	           else if(s11[i-1]==s22[j-1])
	                dp[i][j]=1+dp[i-1][j-1];
	           else 
	                dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
	        }
	    }
	    return dp[a][b];
	}
}
