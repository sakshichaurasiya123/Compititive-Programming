/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
/*
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		  int n=in.nextInt();
		  System.out.println(printCountDP(n));
		}
	}*/
	/*
	//Recursive Solution
	static int count(int n){
	    if(n<0)
	        return 0;
	   if(n==0)
	        return 1;
	   int sum=0;
	  return count(n-1)+count(n-2)+count(n-3);
	} 
	*/
	// A Dynamic Programming based Java program 
// to count number of ways to cover a distance 
// with 1, 2 and 3 steps 
import java.io.*; 

class GFG 
{ 
	// Function returns count of ways to cover 'dist' 
	public static int countWays(int n) 
    { 
        int[] res = new int[n + 1]; 
        if(n==0 || n==1){
            return 1;
        }
        if(n==2)
            return 2;
        else if(n>2)
        {
            res[0]=1;
            res[1]=1;
            res[2]=2;
        
        for (int i = 3; i <= n; i++) 
            res[i] = res[i - 1] + res[i - 2] 
                     + res[i - 3]; 
  
       
        }
         return res[n]; 
    } 
 
	// driver program 
	public static void main (String[] args) 
	{ 
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
		int dist = in.nextInt(); 
		System.out.println(countWays(dist)); 
	    }
	} 
} 

// This code is contributed by Pramod Kumar 

