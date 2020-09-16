/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int []arr=new int [n];
	    int v=0;
	    for(int i=0; i<n; i++)
	   {
	       v=in.nextInt();
	       arr[i]=(v^2);
	   }
	   checkTriplet(arr,n);
	    
	}
	static void checkTriplet(int []arr,int n){
	    boolean b=false;
	    Arrays.sort(arr);
	    int sum=0,contain=0;
	    for(int i=0; ((i<arr.length) && (i+1<arr.length)); i++){
	            sum=arr[i]+arr[i+1];
	            contain=Arrays.binarySearch(arr,sum);
	            if(contain>0)
	                b=true;
	      	    }
	    if(b==true)
	        System.out.println ("Yes");
	   else
	        System.out.println("No");
	}
}
