/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		 int i=partitionArray(arr,n);
		 if(i!=-1){
		     printArray(arr,0,i-1);
		     printArray(arr,i,arr.length-1);
		 }
		 else
		    System.out.println("Invalid Input");
		 
	}
/*	static int partitionArray(int arr[],int n){
	    
	    for(int i=0; i<n; i++){
	        int leftSum=0;
	        for(int j=0; j<i; j++)
	            leftSum +=arr[j];
	        int rightsum=0;
	        for(int j=i; j<arr.length; j++)
	            rightsum +=arr[j];
	            if(leftSum==rightsum)
	                return i;
	    }
	    return -1;
	}*/
	//Other way
	static int partitionArray(int arr[],int n){
	    int leftsum=0;
	    for(int i=0; i<n; i++)
	        leftsum +=arr[i];
	   int rightsum=0;
	   for(int i=n-1; i>=0; i--){
	       rightsum +=arr[i];
	       leftsum -=arr[i];
	       if(leftsum==rightsum)
	            return i;
	   }
	   return -1;
	}
	static void printArray(int arr[],int i, int j){
	    //System.out.println(IntStream.rangeClosed(i,j).mapToObj(k->arr[k]).collect(Collectors.toList()));
	
	    for(int k=i; k<=j; k++)
	        System.out.print(arr[k]+" ");
	   System.out.println();
	}
}
