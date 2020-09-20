/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		
		//Without Using 3rd Variable
		int x=2;
		int y=4;
		x=x+y;
		y=x-y;;
		x=x-y;
		System.out.println(x+" "+y);
		
		//Using 3rd varibale
		int k=6;
		int l=8;
        int temp=k;
        k=l;
        l=temp;
        System.out.println("K "+k+" L "+l);
	}
}
