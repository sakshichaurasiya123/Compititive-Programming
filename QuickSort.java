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
		    
		 sort(arr,0,n-1);
		 for(int value=0; value<n; value++)
		    System.out.print(arr[value]+" ");
		// System.out.println();
	   	}
	   	static void sort(int arr[],int low,int high){
	   	    if(low<high){
	   	    int pivot=partition(arr,low,high);
	   	    sort(arr,low,pivot-1);
	   	    sort(arr,pivot+1, high);
	   	    }
	   	}
	   	static int partition(int arr[],int low,int high){
	   	   // high=arr.length-1;
	   	   // low=0;
	   	    int pivot=arr[high];
	   	    int i=(low-1);
	   	    for(int j=low; j<high; j++){
	   	        if(arr[j]<pivot){
	   	        i++;
	   	            swap(arr,i,j);
	   	        }
	   	    }
	   	    swap(arr,i+1,high);
	   	    //System.out.println(Arrays.toString(arr));
	   	    return i+1;
	   	}
	   	static void swap(int arr[],int i,int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	   	}
	   	
}
