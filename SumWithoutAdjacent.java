import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	    int prev=Integer.MIN_VALUE;
	    int max=maxsum(arr,n);
//	 int max=maxsum(arr,0,n,prev);
	 System.out.println(max);
	}
/*	static int  maxsum(int arr[],int i,int n,int prev){
	    int max=0;
	    if(i==n)
	       return 0;
	    int inc=0;
	   int exc=maxsum(arr,i+1,n,prev);
	   if((prev+1)!=i){
	   inc=maxsum(arr,i+1,n,i)+arr[i];
	   }
	   return Math.max(exc,inc);
	   
	}*/
	//Using DP
/* static  int maxsum(int arr[],int n){
	    int dp[]=new int[n];
	    dp[0]=arr[0];
	    dp[1]=Math.max(arr[0],arr[1]);
	    for(int i=2; i<n; i++){
	        dp[i]=Math.max(dp[i-1],dp[i-2]+arr[i]);
	        dp[i]=Math.max(dp[i],arr[i]);
	    }
	    System.out.println(Arrays.toString(dp));
	    return dp[n-1];
	} */
	//Without Using any extra space
	static int maxsum(int arr[],int n){
	    int prev_prev=arr[0];
	    int prev=Math.max(arr[0],arr[1]);
	    int cur=0;
	    for(int i=2; i<n; i++){
	        cur=Math.max(prev,prev_prev+arr[i]);
	        prev_prev=prev;
	        prev=cur;
	    }
	    return prev;
	}
}
