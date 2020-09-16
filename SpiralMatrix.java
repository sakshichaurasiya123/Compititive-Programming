/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0){
		    int m=in.nextInt();
		    int n=in.nextInt();
		    int mat[][]=new int[m][n];
		    for(int i=0; i<m; i++){
		        for(int j=0; j<n; j++)
		            mat[i][j]=in.nextInt();
		    }
		    spiral(mat,m,n);
		}
	}
	static void spiral(int mat[][],int m,int n){
	    int mincol=0,minrow=0,maxcol=n,maxrow=m;
	    while( minrow<maxrow && mincol<maxcol ){
	        for(int i=mincol; i<maxcol; ++i)
	            System.out.print(mat[minrow][i]+" ");
	       minrow++;
	       for(int i=minrow; i<maxrow; ++i)
	            System.out.print(mat[i][maxcol-1]+" ");
	       maxcol--;
	       if(minrow<maxrow){
	       
	       for(int i=maxcol-1; i>=mincol; --i)
	            System.out.print(mat[maxrow-1][i]+" ");
	       maxrow--;
	       }
	       if(mincol<maxcol){
	       for(int i=maxrow-1; i>=minrow; --i)
	            System.out.print(mat[i][mincol]+" ");
	       mincol++;
	           
	       }
	    }
	    System.out.println();
	}
}
