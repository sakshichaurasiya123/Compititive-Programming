/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String ch[]=new String[n];
		for (int i=0; i<n; i++ )
		    ch[i]=in.next();
		findtwono(ch,n);
	}
	static void findtwono(String arr[],int n){
	    Arrays.sort(arr,Comparator.reverseOrder());
	    String x="";
	    String y="";
	    for(int i=0; i<arr.length; i+=2)
	        x=x.concat(arr[i]);
	    for(int i=1; i<arr.length; i+=2)
	        y=y.concat(arr[i]);
	  System.out.println(x);
	  System.out.println(y);
	}
}
