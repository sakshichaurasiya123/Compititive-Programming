/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import com.google.common.primitives.Ints;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		int target=in.nextInt();
		fL(arr,target);
	}
	static void fL(int arr[],int target){
	    int r=Arrays.binarySearch(arr,target);
	    if(r<0){
	        System.out.println("target not found");
	    }
	    else{
	    System.out.println(Ints.indexOf(arr,target));
	    System.out.println(Ints.lastIndexOf(arr,target));
	    }
	}
}
