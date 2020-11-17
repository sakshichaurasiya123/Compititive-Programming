/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    for(int i=2; i<=n; i++){
	        boolean isprime=true;
	        for(int j=2; j<i; j++){
	            if(i%j==0){
	                 isprime=false;
	                break;
	            }
	        }
	        if(isprime)
	            System.out.println(i);
	    }
	    
	}
}
