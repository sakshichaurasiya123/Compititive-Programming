/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int a[]=new int[n];
	int m=in.nextInt();
	int b[]=new int[m];
	for(int i=0; i<n; i++)
	    a[i]=in.nextInt();
	for(int j=0; j<m; j++)
	    b[j]=in.nextInt();
	ArrayList<Integer>arr=new ArrayList<Integer>();
	 add(a,n,b,m,arr);
	 for(int i:arr)
	    System.out.print(i+" ");
	}
	static void split(int num,List<Integer>list){
	    if(num>0){
	    split(num/10,list);
	    list.add(num%10);
	    }
	}
	static void add(int a[],int n,int b[],int m,List<Integer>result){
	    int i=0;
	    
	    while(i<n && i<m){
	       int sum=a[i]+b[i];
	        split(sum,result);
	        i++;
	    }
	    while(i<n)
	        split(a[i++],result);
	   while(i<m)
	        split(b[i++],result);
	}
	
}
