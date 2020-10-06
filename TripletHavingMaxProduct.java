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
	   triplet(arr,n);
	}
	static void triplet(int arr[],int n){
	    Arrays.sort(arr);
	    //int n=arr.length;
	    if(n<=2)
	        System.out.println("No Triplet Found");
	    if(arr[n-3]*arr[n-2]*arr[n-1]>arr[0]*arr[1]*arr[n-1])
	        System.out.println(arr[n-3]+" "+arr[n-2]+" "+arr[n-1]);
	   else
	        System.out.println(arr[0]+" "+arr[1]+" "+arr[n-1]);
	}
}
