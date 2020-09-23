/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	        arr[i]=in.nextInt();
	    int dp[]=new int [n];
	        int max_so_far=0;
	        int max_ending=0;
	          int len =0; int begin=0; int end=0;
	            int start=0;
	          
	    for(int i=1; i<n; i++){
	            max_ending +=arr[i];
	            if(max_so_far<max_ending){
	                max_so_far=max_ending;
	                start =begin;
	                end=i;
	            }
	           else if(max_ending<0){
	            max_ending=0;
	            begin=i+1;
	           }
	    }
	    for (int value=start; value<=end; value++ )
	        System.out.print(arr[value]+" ");
	   System.out.println();
	    System.out.println(start+" "+end);
	    System.out.println(max_so_far);
	}
}
