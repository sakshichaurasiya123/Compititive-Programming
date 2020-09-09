import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0){
	int n=in.nextInt();
	int m=in.nextInt();
	String s1=in.next();
	String s2=in.next();
	//char s11[]=s1.toCharArray();
	//char s22[]=s2.toCharArray();
	//int max=0;
	int dp[][]=new int[n+1][m+1];
	dp[0][0]=0;
	for(int i=1; i<=n; i++)
	    dp[i][0]=i;
	 for(int i=1; i<=m; i++)
	    dp[0][i]=i;
	  for(int i=1; i<=n; i++){
	      for(int j=1; j<=m; j++){
	          if(s1.charAt(i-1)==s2.charAt(j-1))
	            dp[i][j]=dp[i-1][j-1];
	           else{
	               dp[i][j]=1+Math.min(Math.min(dp[i][j-1],dp[i-1][j]),dp[i-1][j-1]);
	               //if(dp[i][j]>max)
	               // max=dp[i][j];
	           }
	      }
	  }
	System.out.println(dp[n][m]);
	}
	}
}
