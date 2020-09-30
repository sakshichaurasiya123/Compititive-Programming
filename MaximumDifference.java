/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	int diff=Integer.MIN_VALUE;
	int max=arr[n-1];
	int min=0;
	for(int i=n-2; i>=0; i--){
	    if(arr[i]>max)
	        max=arr[i];
	    else{
	        diff=Math.max(diff,max-arr[i]);
	        min=arr[i];
	    }
	}
	System.out.println("Maximum difference "+min+" and "+max+" = "+diff);
	}
}
