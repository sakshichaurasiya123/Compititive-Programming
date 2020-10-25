/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    String s=in.nextLine();
	    int key=in.nextInt()%26;
	    String res="";
	    for(int i=0; i<s.length(); i++)
	    res=res+ceaser(s.charAt(i),key);
	    System.out.println(res);
	}
	static char ceaser(char s,int key){
	    if(Character.isLetter(s)){
	        int i=(int)s;
	        i=i+key;
	        if(Character.isUpperCase(s)){
	            if(i>90){
	                int num=(int)s+key;
	                i=num-26;
	            }
	        }
	        else if(i>122){
	            int num=(int)s+key;
	            i=num-26;
	        }
	        return (char)i;
	        
	    }
	    else if(!Character.isLetter(s)){
	        int i=(int)s;
	        i=i+key;
	        return (char)i;
	    }
	    else if(s==' '){
	        return ' ';
	    }
	    
        return ' ';	    
	}
}
