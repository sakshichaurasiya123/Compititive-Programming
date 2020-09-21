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
		Set<Integer> set=new HashSet<Integer>();
		for( int value=0; value<n; value++){
		    if(!set.contains(arr[value]))
		        set.add(arr[value]);
		    else
		        System.out.println(arr[value]);
		}
		
	}
}
