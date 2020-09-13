/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String str="geeksforgeeks";
		char ch[]=str.toCharArray();
		ArrayList<Character> arr=new ArrayList<Character>();
		for(int i=0; i<ch.length; i++)
		    arr.add(ch[i]);
		 HashSet<Character> hs=new HashSet<Character>(arr);
		 for(Character s:hs){
		    System.out.println( s +" : "+Collections.frequency(arr,s)+"  ");
		    
		 }
		//System.out.println(Collections.frequency(arr,));
		  
	}
}
