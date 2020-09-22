/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		    arr.add(in.nextInt());
		   ArrayList<Integer> arr2=new ArrayList<Integer>();
		    int p=1;
		for(int i=0; i<n; i++)
		     p *=arr.get(i);
		  for(int i=0; i<n; i++)
		    arr2.add(p/arr.get(i));
		
		System.out.println(arr2);
	   }
}
