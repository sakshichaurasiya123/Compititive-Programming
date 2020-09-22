/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++)
        arr[i]=in.nextInt();
        int max=Integer.MIN_VALUE;
        int sum=0;
    for(int i=0; i<arr.length-1; i++){
        
        sum=arr[i]*arr[i+1];
        if(sum>=max){
            System.out.println(arr[i]+" "+arr[i+1]);
            max=sum;
        }
        
     }
     System.out.println(max);
	}
}
