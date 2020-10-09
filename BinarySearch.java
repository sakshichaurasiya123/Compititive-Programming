import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	  Scanner in=new Scanner(System.in);
	  int n=in.nextInt();
	  int arr[]=new int[n];
	  for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	  int key=in.nextInt();
	  int r=binarySearch(arr,key);
	    if(r!=-1)
	        System.out.println("Element found at index : "+r);
	   else
	        System.out.println("Element doesn't found");
	}
	static int binarySearch(int arr[],int k){
	    int low=0; 
	    int high=arr.length-1;
	    while(low<=high){
	        int mid=(low+high)/2;
	        if(k==arr[mid])
	            return mid;
	        else if(k<arr[mid])
	            high=mid-1;
	        else    
	            low=mid+1;
	    }
	    return -1;
	}
}
