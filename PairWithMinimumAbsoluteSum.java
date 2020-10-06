/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		    pair(arr,n);
	}
	static void pair(int arr[],int n){
	    int low=0,high=arr.length-1,min=Integer.MAX_VALUE;
	    int i=0,j=0;
	    while(low<high){
	        int abs=Math.abs(arr[low]+arr[high]);
	        if(abs<min){
	            min=abs;
	            i=arr[low];
	            j=arr[high];
	           
	        }
	        else{
	             low++;
	            high--;
	        }
	      
	           
	    }
	    System.out.println(i+" "+j+" = "+min);
	}
}
