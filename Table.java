/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int  num=in.nextInt();
	    printtable(num);
	}
	static void printtable(int num){
	   int value=0;
	   for(int i=1; i<=10; i++){
	       value=num*i;
	       System.out.print(value+" ");
	   }
	}
}
