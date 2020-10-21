/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int n1=8,n2=20;
		int hcf=1;
		for(int i=1; i<=n2; i++){
		    if(n1%i==0 && n2%i==0)
		        hcf=i;
		}
		System.out.println(hcf);
	}
}
