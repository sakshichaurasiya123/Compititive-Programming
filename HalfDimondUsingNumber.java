/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	       Scanner in=new Scanner(System.in);
	      // int x=in.nextInt();
	       int y=in.nextInt();
	       for(int i=1; i<=y; i++){
	           int k=1;
	           for(int j=1; j<=i; j++){
	            System.out.print(i);
	            if(k<i){
	                System.out.print("*");
	                k++;
	            }
	           }
	           
	           System.out.println();
	       }
	      // x=x-1;
	       for(int i=y; i>0; i--){
	           int k=1;
	           for(int j=1; j<=i; j++){
	            System.out.print(i);
	            if(k<i){
	                System.out.print("*");
	                k++;
	            }
	           }
	           // x--;
	            System.out.println();
	       }
	}
}
