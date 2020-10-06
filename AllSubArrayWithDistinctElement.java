import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for (int i=0; i<n; i++ )
		    arr[i]=in.nextInt();
		subArray(arr,n);
	}
	static void subArray(int arr[],int n){
	   for(int j=0; j<n; j++){
	       ArrayList<Integer>arr1=new ArrayList<Integer>();
	       for(int i=j; i<n; i++){
	        if(!arr1.contains(arr[i]))
	            arr1.add(arr[i]);
	       else{
	           System.out.println(arr1);
	           break;
	         }
	       }
	   }
	}
}
