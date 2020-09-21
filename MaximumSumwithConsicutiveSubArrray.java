/*package whatever //do not write package name here */

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
		Set<Integer> s=new TreeSet<Integer>();
	    for(int value=0; value<arr.length; value++)
	        s.add(arr[value]);
	   ArrayList<Integer> s1=new ArrayList<Integer>(s);
	        int sum =0;
	        int max=0;
	        for(int i=0; i<s1.size(); i++){
	            sum +=s1.get(i);
	            //sum +=m;
	            max=Math.max(sum,max);
	        }
	 	System.out.println(max);
	}
}
