/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
		int s=in.nextInt();
		String result=Integer.toBinaryString(s);
		int result1=0;
		if((result.length())<32)
		    result1=32-result.length();
		    String result2="";
		for(int i=0; i<result1; i++)
		    result2=result2.concat("0");
		System.out.println(result1);
		String res=result2+result;
		System.out.println(res);
	try{
		char ch[]=res.toCharArray();
		int i=0;
		while(i<ch.length){
		    if(ch[i]=='0')
		        ch[i]='1';
		      else if(ch[i]=='1')
		        ch[i]='0';
		       i++;
		}
		 //String str = new String(ch);
		
		//int decimal=Integer.parseInt(str,2);
		for(int h=0; h<ch.length;h++)
		       System.out.print(ch[h]);
	    
	}
	catch(NumberFormatException ex){}
	     //System.out.println(resu);
	    
	}
}
