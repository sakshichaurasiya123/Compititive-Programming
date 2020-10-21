/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int octal=1907;
		otd(octal);
	}
	static void otd(int octal){
	    int i=0;
	    int result=0;
	    StringBuffer br=new StringBuffer();
	    while(octal>0){
	        int d=octal%10;
	        int r=d*(int)Math.pow(8,i++);
	        octal /=10;
	        result +=r;
	       
	    }
	  //  br.reverse();
	    System.out.println(result);
	}
}
