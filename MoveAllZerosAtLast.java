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
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		  for(int i=0; i<arr.size(); i++){
		    if(arr.get(i)==0)
		        arr1.add(0);
		  }
		  arr.removeAll(arr1);
		  arr.addAll(arr1);
		  Iterator itr=arr.iterator();
		  while(itr.hasNext())
		    System.out.print(itr.next()+" ");
	   }
}
