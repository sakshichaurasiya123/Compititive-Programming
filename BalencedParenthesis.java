/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	       Scanner in=new Scanner(System.in);
	       String x=in.nextLine();
	        Stack<Character> stack=new Stack<Character>();
	        char c;
	        int count=0;
	        for(int i=0; i<x.length(); i++){
	         c=x.charAt(i);
	         
	         if(c=='('){
	            stack.push(c); 
	         }
	         if(c==')'){
	             if(stack.empty()){
	                 count-=1;
	                 System.out.println(count);
	                 break;
	             }
	          else if(stack.peek()=='('){
	              count++;
	              stack.pop();
	          }   
	         }
	        }
	        System.out.println(count);
	       
	}
}
