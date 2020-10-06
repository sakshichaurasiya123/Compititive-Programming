/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		    minimumways(arr,n);
	}
	static void minimumways(int arr[],int n){
	    int index=0;
	   Set<Integer>set=new LinkedHashSet<Integer>();
	   for(int i=n-1; i>=0; i--){
	       if(!set.contains(arr[i]))
	            set.add(arr[i]);
	       else
	            index=i;
	   }
	   if(index>0)
	   System.out.println(index);
	   else
	   System.out.println("Invalid Input");
	}
}
