import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	    selectionSort(arr,n);
	}
	static void selectionSort(int arr[],int n){
	    for(int i=0; i<arr.length-1; i++){
	        int min=i;
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[j]<arr[i])
	                min=j;
	        }
	        swap(arr,min,i);
	         System.out.println(Arrays.toString(arr));
	    }
	}
	static void swap(int arr[],int i,int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
}
