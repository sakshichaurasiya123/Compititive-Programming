/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int t=in.nextInt();
	while(t-->0){
	    String s=in.next();
	    String []ch=s.split("\\.");
	    StringBuffer br=new StringBuffer();
	    for(int i=ch.length-1; i>0; i--){
	        br.append(ch[i]+".");
	    }
	    br.append(ch[0]);
	   // br.reverse();
	    System.out.println(br);
	}
	}
}
