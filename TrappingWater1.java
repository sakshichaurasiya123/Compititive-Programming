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
            watertrapping(arr,n);
        }
	}
	static void watertrapping(int arr[],int n){
	   /* int left[]=new int[n];
	    //Arrays.fill(left,0);
	    int right[]=new int[n];
	   // Arrays.fill(right,0);
	   left[0]=arr[0];
	    for(int i=1; i<n; i++){
	        left[i]=Math.max(arr[i],left[i-1]);
	    }
	    right[n-1]=arr[n-1];
	    for(int i=n-2; i>=0; i--){
	        right[i]=Math.max(arr[i],right[i+1]);
	    }
	    int sum=0;
	    for(int i=0; i<n; i++)
	        sum +=Math.min(left[i],right[i])-arr[i];
	    System.out.println(sum);*/
	   // Another Solution
	   int left=0;
	   int right=0;
	   int l=0;
	   int r=n-1;
	   int res=0;
	   while(l<r){
	       if(arr[l]<arr[r]){
	           if(arr[l]>left)
	            left=arr[l];
	           else
	            res+=left-arr[l];
	       l++;
	       }
	       else{
	           if(arr[r]>right)
	            right=arr[r];
	           else
	            res +=right-arr[r];
	       r--;
	       }
	   }
	   System.out.println(res);
	}
}
