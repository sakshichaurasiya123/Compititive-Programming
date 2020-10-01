/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	String arr[]=new String[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.next();
	   largest(arr,n);
	}
	static void largest(String arr[],int n){
	  //  List<String> res=Arrays.asList(arr);
	    Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
	
	        Arrays.stream(arr).forEach(System.out::print); 

	}
}
