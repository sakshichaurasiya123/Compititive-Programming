/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int dp[]=new int[n+1];
	dp[0]=1;
	dp[1]=2;
	int zero=1;
	int m=1000000007;
	for(int i=2; i<=n; i++){
	   dp[i]=(zero+dp[i-1])%m;
	   zero=dp[i-1];
	}
	for(int i=0; i<=n ; i++)
	System.out.print(dp[i]+" ");
	}

}
