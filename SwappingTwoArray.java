/*package whatever //do not write package name here */

import java.io.*;

import java.util.*;
class GFG {
	public static void main (String[] args) {
		
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int arr1[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		for(int j=0; j<n; j++)
		    arr1[j]=in.nextInt();
		   
		    System.out.println("Before Wsapping");
		 for(int i=0; i<n; i++)
		      System.out.print(arr[i]+" ");
		  System.out.println();
		 for(int i=0; i<n; i++)
		       System.out.print(arr1[i]+" ");
		for(int i=0; i<n; i++){
		    arr[i]=arr[i]+arr1[i];
		    arr1[i]=arr[i]-arr1[i];
		    arr[i]=arr[i]-arr1[i];
		}
		System.out.println();
		System.out.println("After Swapping");
		for(int i=0; i<n; i++)  
		    System.out.print(arr[i]+" ");
		 System.out.println();
		for(int i=0; i<n; i++)
		    System.out.print(arr1[i]+" ");
		 System.out.println();
	}
}
