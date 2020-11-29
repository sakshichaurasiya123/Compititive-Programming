/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	int count=0;
	int sum=0;
	Arrays.sort(arr);
	for(int i=0; i<n; i++){
	        if((sum+arr[i])<=k)
	        sum +=arr[i];
	        else if((sum+arr[i])>k)
	           {
	               System.out.println(sum);
	               count++;
	               sum=0;
	               if(sum+arr[i]<k)
	               sum+=arr[i];
	           }
	  }
	    System.out.println(count);
	}
}
