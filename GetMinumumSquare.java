import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException{
	    Scanner in=new Scanner(System.in);
	    int q=in.nextInt();
	    while(q-->0){
	        int n=in.nextInt();
		    int dp[]=new int[n+1];
		    dp[0]=0;
		    dp[1]=1;
		    dp[2]=2;
		    dp[3]=3;
		    for(int i=4; i<=n; i++){
		        dp[i]=i;
		        for(int x=1; x<=Math.ceil(Math.sqrt(i)); x++){
		            int temp=x*x;
		            if(temp>i)
		                break;
		            else
		                dp[i]=Math.min(dp[i],1+dp[i-temp]);
		        }
		    }
		    System.out.println(dp[n]);
		   
		    for(int i=0; i<dp.length; i++)
		        System.out.print(dp[i]+" ");
		    System.out.println();
	    }
	}
}
