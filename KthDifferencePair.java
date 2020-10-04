/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer>arr=new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		    arr.add(in.nextInt());
		int k=in.nextInt();
		Collections.sort(arr);
		 for(int i=0; i<arr.size()-1; i++){
		    if(arr.get(i)==arr.get(i+1))
		        arr.remove(i);
		 }
		  for(int i=0; i<arr.size()-1; i++){
		    if(arr.get(i)==arr.get(i+1))
		        arr.remove(i);
		 }
		 for(int i=0; i<arr.size()-1; i++){
		     for(int j=i+1; j<arr.size(); j++){
		        if(Math.abs(arr.get(i)-arr.get(j))==k)
		            System.out.println("("+arr.get(i)+" "+arr.get(j)+" )");
		     }	
		   }
		 System.out.println(arr);
		  
	}
}
