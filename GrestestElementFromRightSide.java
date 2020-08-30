/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	for(int k=0; k<t; k++){
	   int n=in.nextInt();
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for(int i=0; i<n; i++)
	    arr.add(in.nextInt());
	for(int i=0; i<arr.size()-1; i++){
	    int result=0;
	        ArrayList<Integer> arr1=new ArrayList<Integer>(arr.subList(i+1,arr.size()));
	       result= Collections.max(arr1);
	       arr.set(i,result); 
	}
	 arr.set(arr.size()-1,-1);
	 Iterator itr=arr.iterator();
	 while(itr.hasNext())
	    System.out.print(itr.next() +" ");
	    
	System.out.println();
	}
	}
}
