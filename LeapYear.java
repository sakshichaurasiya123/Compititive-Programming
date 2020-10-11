import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	boolean leap=false;
	while(n-->0){
	        int year=in.nextInt();
	        if(year%4==0){
	            if(year%100==0){
	                if(year%400==0){
	                    leap=true;
	                }
	                else
	                    leap=false;
	            }
	            else
	                leap=false;
	        }
	        else
	            leap=false;
	    if(leap)
	        System.out.println(year +"  is leap year");
	    else
	        System.out.println(year+"  is not a leap year");
	    }
	}
}
