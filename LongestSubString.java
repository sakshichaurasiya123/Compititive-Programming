/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public	static String findlar(String str[]){
	    int n=str.length;
	    String s=str[0];
	    int len=s.length();
	    String re="";
	    for(int i=0; i<len; i++){
	        for(int j=i+1; j<=n; j++){
	            String stem=s.substring(i,j);
	            int k=1;
	            for(k=1; k<n; k++)
	                if(!str[k].contains(stem))
	                    break;
	                if(k==n && re.length()<stem.length())
	                    re=stem;
	            }
	        }
	    
	    return re;
	}
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    String arr[]=new String[n];
	    for(int i=0; i<n; i++)
	        arr[i]=in.next();
	    String stem=findlar(arr);
	    System.out.println(stem);
	}
    
}
