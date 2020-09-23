import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	        arr[i]=in.nextInt();
	    int dp_in[]=new int[n];
	    int dp_out[]=new int[n];
	   dp_in[0]=1;
	   for(int i=1; i<n; i++)
	    dp_in[i]=0;
	    for(int i=0; i<n-1; i++)
	    dp_out[i]=0;
	   dp_out[n-1]=1;
	   for(int i=1; i<n; i++){
	      /* for(int j=0; j<i; j++){
	          if(arr[i]>arr[j] && dp_in[i]<dp_in[j]+1)
	            dp_in[i]=dp_in[j]+1;
	      } */
	      dp_in[i]=1;
	      if(arr[i]>arr[i-1])
	      dp_in[i]=dp_in[i-1]+1;
	   }
	   for(int i=n-2; i>=0; i--){
	      /* for(int j=n-1; j>i; j--){
	    if(arr[i]>arr[j] && dp_out[i]<dp_out[j]+1)
	            dp_out[i]=dp_out[j]+1;
	       }*/
	       dp_out[i]=1;
	       if(arr[i]>arr[i+1])
	            dp_out[i]=dp_out[i+1]+1;
	       
	   }
	   int beg=0, end=0; int lbs_len=0;
	   for(int i=0; i<n; i++){
	      // if(dp_in[i]>dp_out[i])
	        int len=dp_in[i]+dp_out[i]-1;
	        if(lbs_len<len){
	            lbs_len=len;
	            beg=i-dp_in[i]+1;
	            end=i+dp_out[i]-1;
	        }
	   }
	  System.out.println(" Bitonic : "+lbs_len);
	  System.out.println("Beginning : "+beg+" End : "+end);
	  //System.out.println(max);
	}
}
