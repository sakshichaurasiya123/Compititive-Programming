/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int n=in.nextInt();
		    String s=in.next();
		    char ch[]=s.toCharArray();
		    long r=swap(ch);
		    System.out.println(r);
		}
	}
	static long swap(char ch[]){
	  int left=0,right=0,imbalence=0,count=0;
	    for(int i=0; i<ch.length; i++){
	        if(ch[i]=='[')
	           {
	               left++;
	               if(imbalence>0){
	                   count+=imbalence;
	                   imbalence--;
	               }
	           }
	           else if(ch[i]==']'){
	               right++;
	               imbalence=(right-left);
	           }
	    }
	    return (long)count;
	   // System.out.println(count);
	}
}
