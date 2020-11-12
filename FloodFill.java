/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int m=in.nextInt();
	int n=in.nextInt();
	int arr[][]=new int[n][m];
	for(int i=0; i<m; i++){
	    for(int j=0; j<n; j++)
	        arr[i][j]=in.nextInt();
	}
	floodFill(arr,0,0,3,1);
	for(int i=0; i<m; i++){
	    for(int j=0; j<n; j++)
	        System.out.print(arr[i][j]+" ");
	   System.out.println();
	}
	}
	static void floodFill(int arr[][],int r,int c,int tofill,int prevfill){
	    int row=arr.length;      
	    int col=arr[0].length;
	    if(r<0 || r>=row || c<0 || c>=col){
	        return;}
	   if(arr[r][c]!=prevfill){
	        return;}
	   arr[r][c]=tofill;
	   floodFill(arr,r-1,c,tofill,prevfill);
	   floodFill(arr,r,c-1,tofill,prevfill);
	   floodFill(arr,r+1,c,tofill,prevfill);
	   floodFill(arr,r,c+1,tofill,prevfill);
	}
}
