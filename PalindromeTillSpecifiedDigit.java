/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int digit=in.nextInt();
		palindrom(num,digit);
	}
	static void palindrom(int num,int digit){
	    int last=(int)Math.pow(10,digit);
	    for(int i=num; i<last; i++){
	        int rev=0;
	        int temp=i;
	        int d;
	        while(temp>0){
                d=temp%10;
                rev=rev*10+d;
                temp=temp/10;
	        }
	        if(i==rev){
	            System.out.print(i);
	       if(i!=last-1)
	           System.out.print(",");
	        }
	    }
	}
}
