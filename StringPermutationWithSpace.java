/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
	    StringBuffer s1=new StringBuffer(s);
	    StringBuffer s2=new StringBuffer();
	    s2.append(s.charAt(0));
	    s1.deleteCharAt(0);
	    String s3=new String(s1);
	    String s4=new String(s2);
	    solve(s3,0,s4);
	}
	static void solve(String  in,int index,String out){
	    if(in.length()==index){
	        System.out.println(out);
	        return ;
	    }
	    solve(in,index+1,out+("_")+in.charAt(index));
	    solve(in,index+1,out+in.charAt(index));
	    
	    
	}
}
