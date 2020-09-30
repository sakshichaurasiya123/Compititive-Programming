import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	  int k=in.nextInt();
	    minimum(arr,n,k);
	    
   	}
   	//Brute Force Solution
   	/*static void minimum(int arr[],int n,int k){
   	    int i=0;
   	    int max=0;
   	    int diff=0;
   	    while(i<(n-k)){
   	        
   	        for(int j=i; j<k; j++){
   	            max +=arr[j];
   	        }
   	        i++;
   	        diff=Math.max(diff,max);
   	    }
   	    System.out.println(diff);
   	}*/
   	//Sliding Window Technique
   	static void minimum(int arr[],int n, int k){
   	    int wsum=0;
   	    int max=0;
   	    for(int i=0; i<k; i++)
   	        wsum +=arr[i];
   	    for(int end=k; end<arr.length; end++){
   	        wsum +=arr[end]-arr[end-k];
   	        max=Math.max(wsum,max);
   	    }
   	    System.out.println(max);
   	}
}
