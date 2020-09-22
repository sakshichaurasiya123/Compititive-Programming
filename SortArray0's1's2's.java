/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//int arr[]=new int[n];
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i=0; i<n; i++)
		    arr.add(in.nextInt());
	    sort(arr, n);
	}
	public static void sort(List<Integer> arr,int n){
	    int end=arr.size()-1;
	    int low=0;
	    int mid=0; 
	    int pivot=1;
	    while(mid<=end){
	        if(arr.get(mid)<pivot){
	            Collections.swap(arr, mid,low);
	            ++low;
	            ++mid;
	            System.out.println("mid less from pivot  :  "+arr);
	        }
	       else if(arr.get(mid)>pivot){
	            Collections.swap(arr,mid,end);
	            --end;
	            System.out.println("Mid greater from pivot : "+arr);
	        }
	        else{
	            ++mid;
	            System.out.println("Only mid Increase    : "+arr);
	        }
	    }
	    System.out.println("Final Sorted List : "+arr);
	}
}
