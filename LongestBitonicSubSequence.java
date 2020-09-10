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
	        int arr[]=new int[n];
	        for(int i=0; i<n; i++)
	            arr[i]=in.nextInt();
	       int res=count(arr,n);
	       System.out.println(res);
	    }
	}
	static int count(int arr[], int n){
	   int dp_in[]=new int[n+1];
	   int dp_dec[]=new int[n];
	   for(int i=0; i<n; i++){
	        dp_in[i]=1;
	        dp_dec[i]=1;
	   }
	   for(int i=1; i<n; i++){
	       for(int j=0; j<i; j++){
	           if(arr[j]<arr[i] && dp_in[i]<dp_in[j]+1){
	            dp_in[i]=dp_in[j]+1;
	           }
	           
	       }
	   }
	   for(int i=n-2; i>0; i--){
	       for(int j=n-1; j>i; j--){
	           if (arr[j]<arr[i] && dp_dec[i]<dp_dec[j]+1){
	                dp_dec[i]=dp_dec[j]+1;
	           }
	       }
	   }
	 /* System.out.print("ASC DP :   ");
	   for(int i=0; i<n; i++)
	   {
	       System.out.print(dp_in[i]+ " ");
	   }
	   System.out.println();
	   System.out.print("DSC DP :   ");
	   for(int i=0; i<n; i++)
	   {
	       System.out.print(dp_dec[i]+" ");
	   }
	   System.out.println();
	   */
	   
	   int max=dp_in[0]+dp_dec[0]-1;
	   for(int i=1; i<n; i++){
	       if(max<((dp_in[i]+dp_dec[i])-1))
	            max=((dp_in[i]+dp_dec[i])-1);
	   }
	   return max;
	}
}
