/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		  int count=0;
		  for(int i=0; i<n; i++){
		    if(arr[i]==0)
		        count++;
		  }
		    int count1=0;
		  for(int i=0; i<n; i++){
		    if(arr[i]==1)
		        count1++;
		  }
		  StringBuffer br=new StringBuffer();
		  for(int i=0; i<count; i++)
		    br.append("0").append(" ");
		   for(int i=0; i<count1; i++)
		    br.append("1").append(" ");
		   System.out.println(br);
	}
}
