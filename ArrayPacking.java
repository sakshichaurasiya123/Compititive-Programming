/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for (int i=0;i<n ;i++ )
	    arr[i]=in.nextInt();
	    convert(arr,n);
	}
	static void convert(int arr[],int n){
	   /* int sum=arr[0];
	    int temp=8;
	    for(int i=1; i<n; i++){
	        int tmp=arr[i];
	        int t=temp;
	        while(tmp>0){
	            int r=tmp%2;
	            tmp /=2;
	            if(r==1)
	                sum+=Math.pow(2,t);
	           t++;
	        }
	        temp +=8;
	    }*/
	    String s2="";
	     String result=Integer.toBinaryString(arr[n-1]);
	        String s1=String.format("%8s",result).replaceAll(" ","0");
	       s2=s2.concat(s1);
	    for (int i=1; i<n-1; i++){
	        int sum=0;
	       result=Integer.toBinaryString(arr[i]);
	        s1=String.format("%8s",result).replaceAll(" ","0");
	        s2=s2.concat(s1);
	    }
	      result=Integer.toBinaryString(arr[0]);
	        s1=String.format("%8s",result).replaceAll(" ","0");
	       s2 =s2.concat(s1);
	       System.out.println(Integer.parseInt(s2,2));
	}
}
