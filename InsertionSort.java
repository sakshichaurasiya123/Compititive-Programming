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
	    insertionSort(arr,n);
	}
	static void insertionSort(int arr[],int n){
	    for(int i=1; i<arr.length; i++){
	        int value=arr[i];
	        int j=i;
	        while(j>0 && arr[j-1]>value){
	            arr[j]=arr[j-1];
	            j--;
	        }
	        arr[j]=value;
	         System.out.println(Arrays.toString(arr));
	    }
	   // System.out.println(Arrays.toString(arr));
	}
}
