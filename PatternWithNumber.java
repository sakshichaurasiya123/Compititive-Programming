/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int n=4;
		int i,j;
		int digit=1;
		int temp;
		for(i=0; i<n; i++){
		    temp=digit;
		    for( j=0; j<=i; j++)
		        System.out.print(temp+++" ");
		    System.out.println();
		}
	}
}
