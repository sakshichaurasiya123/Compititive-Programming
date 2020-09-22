/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++)
        arr[i]=in.nextInt();
       suffle(arr,n);
       System.out.println(Arrays.toString(arr));
	}
	static void suffle(int arr[],int n){
	    for(int i=arr.length-1; i>=1; i--){
	        Random rand=new Random();
	        int j= rand.nextInt(i+1);
	        swap(arr,i,j);
	    }
	}
	static void swap(int arr[],int i,int j){
	    arr[i]=arr[i]+arr[j];
	    arr[j]=arr[i]-arr[j];
	    arr[i]=arr[i]-arr[j];
	}
	
}
