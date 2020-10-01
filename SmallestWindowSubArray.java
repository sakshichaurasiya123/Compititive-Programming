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
	   largest(arr,n);
	}
	static void largest(int arr[],int n){
	    int min=-1, max=-1;
	    int max_so_far=Integer.MIN_VALUE;
	  for(int i=0; i<n; i++){
	          if(max_so_far<arr[i])
	            max_so_far=arr[i];
	           if(arr[i]<max_so_far)
	            max=i;
	  }
	      for(int i=n-1; i>=0; i--){
	          if(max_so_far>arr[i])
	          max_so_far=arr[i];
	          if(arr[i]>max_so_far)
	            min=i;
	  }
	  System.out.println(min+"  "+max);
	      Arrays.sort(arr,min,max+1);
	   System.out.println(Arrays.toString(arr));
	}
}
