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
	       int  max=arr[n-1];
	       int diff=Integer.MIN_VALUE;
	       for(int i=n-2; i>=0; i--){
	           if(max<arr[i])
	            max=arr[i];
	            else
	                diff=Math.max(diff,max-arr[i]);
	       }
	     
	    System.out.println(diff);
	}
}
