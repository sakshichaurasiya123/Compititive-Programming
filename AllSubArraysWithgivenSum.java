/*package whatever //do not write package name here */

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
		int k=in.nextInt();
		subArray(arr,n,k);
	}
	static void subArray(int arr[],int n, int k){
	    for(int i=0; i<arr.length; i++)
	    {
	     int sum=0;
	     for(int j=i; j<n; j++){
	     sum+=arr[j];
	        
	       if(sum==k){
	           printarray(arr,i,j);
	         }	
	        }
	    }
	}
	static void printarray(int arr[],int i,int j){
	    for(int k=i; k<=j; k++)
	        System.out.print(arr[k]+" ");
	   System.out.println();
	}
}
