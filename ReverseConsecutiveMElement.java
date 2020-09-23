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
		 int m=in.nextInt();
		    //CFG cg=new CFG();
		    reverse(arr,n,m);
	}
	static void reverse(int arr[],int n, int m){
	    int i=1;
	    if(i+m <arr.length){
	        for(int j=m;j<arr.length; j +=m){
	            swap(arr,i,j);
	            i +=m;
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
	static void swap(int arr[],int i, int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
	
}
