/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	       Scanner in=new Scanner(System.in);
	       int x=in.nextInt();
	       int y=in.nextInt();
	       for(int i=0; i<y; i++){
	           for(int j=0; j<=i; j++)
	            System.out.print(x);
	           x++;
	           System.out.println();
	       }
	       x=x-1;
	       for(int i=y-2; i>=0; i--){
	           --x;
	           for(int j=0; j<=i; j++)
	            System.out.print(x);
	           // x--;
	            System.out.println();
	       }
	}
}
