import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args)throws IOException {
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        int n=Integer.parseInt(br.readLine());
	        String arr1[]=br.readLine().split(" ");
	        int arr[]=new int[n];
	        for(int i=0; i<n; i++)
	            arr[i]=Integer.parseInt(arr1[i]);
	       pendulumSequence(n,arr);
	    }
	}
	static void pendulumSequence(int n, int arr[]){
	    Arrays.sort(arr);
	    int dp[]=new int[n];
	    for(int i=0; i<n; i++)
	        dp[i]=0;
	    int mid=(n-1)/2;
	    dp[mid]=arr[0];
	    
	    int i=1,j=1;
	    for( i=1; i<=mid; i++){
	        dp[mid+i]=arr[j++];
	        dp[mid-i]=arr[j++];
	    }
	    if(n%2==0)
	        dp[mid+i]=arr[j];
	   StringBuffer br1=new StringBuffer();
	       for(int l=0; l<n; l++)
	            br1.append(dp[l]+" ");
	        System.out.println(br1);
	}
}
