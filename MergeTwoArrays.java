/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int m=in.nextInt();
	ArrayList<Integer> arr=new ArrayList<Integer>();
	ArrayList<Integer> arr1=new ArrayList<Integer>();
	for(int i=0; i<n; i++)
	    arr.add(in.nextInt());
	for(int i=0; i<m; i++)
	    arr1.add(in.nextInt());
	 ArrayList<Integer>zero=new ArrayList<Integer>();
	  for(int i=0; i<arr.size(); i++){
	      if(arr.get(i)==0)
	        zero.add(arr.get(i));
	  }
	arr.addAll(arr1);
	arr.removeAll(zero);
	Collections.sort(arr);
	System.out.println(arr);
	}
}
