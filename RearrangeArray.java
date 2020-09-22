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
		for(int i=1; i<arr.size()-1; i+=2){
		    if(arr.get(i)<arr.get(i-1))
		        Collections.swap(arr,i,i-1);
		    if(i+1<arr.size() && arr.get(i)<arr.get(i+1))
		        Collections.swap(arr, i, i+1);
		}
		Iterator itr=arr.iterator();
		while(itr.hasNext())
		    System.out.print(itr.next()+" ");
	}
}
