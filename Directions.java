/*package whatever //do not write package name here */

import java.io.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		int testcase=5;
		direction(testcase);
	}
	static void direction(int a){
	    int x=0;
	    int y=0; 
	    int distance=10;
	    char ch='R';
	    while(a>0){
	        switch(ch){
	            case 'R':
	            x=x+distance;
	            ch='U';
	            distance=distance+10;
	            break;
	            
	            case 'U':
	            y=y+distance;
	            ch='L';
	            distance=distance+10;
	            break;
	            
	            case 'L':
	            x=x-distance;
	            ch='D';
	            distance=distance+10;
	            break;
	            
	            case 'D':
	            y=y-distance;
	            ch='A';
	            distance=distance+10;
	            break;
	            
	            case 'A':
	            x=x+distance;
	            ch='R';
	            distance=distance+10;
	            break;
	        }
	        a--;
	    }
	    System.out.println(x+"     "+y);
	}
}
