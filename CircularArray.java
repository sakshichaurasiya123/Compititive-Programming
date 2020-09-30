/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
    int res=circularKadane(arr,n);
    System.out.println(res);
	}
	static int circularKadane(int arr[],int n){
	    Arrays.setAll(arr,i-> -arr[i]);
	    System.out.println(Arrays.toString(arr));
	    int max=kadane(arr);
	    Arrays.setAll(arr,i-> -arr[i]);
	    System.out.println(Arrays.toString(arr));
	    return Math.max(kadane(arr),Arrays.stream(arr).sum()+max);
	}
	static int kadane(int arr[]){
	    int max_ending=0,
	    max_so_far=0;
	    for(int i:arr){
	        max_ending +=i;
	        max_ending=Math.max(max_ending,0);
	        max_so_far =Math.max(max_ending,max_so_far);
	    }
	    return max_so_far;
	}
}
