/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int mat[][]=new int[n][n];
	for(int i=0; i<n; i++){
	    for(int j=0; j<n; j++)
	        mat[i][j]=in.nextInt();
	    }
	    int count=0;
	    for(int i=0; i<n; i++){
	        for(int j=0; j<n; j++){
	            if(i==j && mat[i][j]==1)
	                count++;
	        }
	    }
	    if(count==n)
	        System.out.println("True");
	   else
	        System.out.println("False");
	}
}
