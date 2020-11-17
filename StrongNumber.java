/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int t=n;
	    int sum =0;
	    while(t>0){
	        int r=t%10;
	        sum +=factorial(r);
	        t /=10;
	    }
	    if(sum==n)
	        System.out.println(sum + " is a strong number");
	   else
	        System.out.println(n +" is not a strong number");
	}
	static int factorial(int n){
	    int fact=1;
	    while(n>0){
	        fact *=n--;
	        
	    }
	    return fact;
	}
}
