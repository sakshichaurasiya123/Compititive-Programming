/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args)throws IOException {
	    //Scanner in=new Scanner(System.in);
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(br.readLine());
	    while(t-->0){
	        String []s=br.readLine().split(" ");
	        int n=Integer.parseInt(s[0]);
	        int k=Integer.parseInt(s[1]);
	        int []arr=new  int [n];
	        String []arr1=br.readLine().split(" ");
	        for(int i=0; i<n; i++)
	            arr[i]=Integer.parseInt(arr1[i]);
	       reverses(n,k,arr);
	       StringBuffer br1=new StringBuffer();
	       for(int i=0; i<n; i++)
	            br1.append(arr[i]+" ");
	       System.out.println(br1);
	    }
	}
	static void reverses(int n, int k,  int arr[]){
	    for(int i=0; i<n; i +=k){
	        int left=i;
	        int right=Math.min(i+k-1,n-1);
	        while(left<right){
	            swap(arr,left,right);
	            left++;
	            right--;
	        }
	     }
	   }
	    static void swap(int arr[],int left,int right){
	        int temp=arr[left];
	        arr[left]=arr[right];
	        arr[right]=temp;
	    }
}
