/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	        int t=in.nextInt();
	        while(t-->0){
	           // int n=in.nextInt();
	           String s=in.next();
	           char ch[]=s.toCharArray();
	               lastIndex(ch);
	    }
	}
	    public static void lastIndex(char arr[]){
	        boolean b=false;
	       for(int i=arr.length-1; i>=0; i--){
	           if(arr[i]=='1'){
	                System.out.println(i);
	                b=true;
	                return;
	           }
	        }
	        if(b==false)
	            System.out.println(-1);
	}
}
