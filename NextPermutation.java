import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int n=in.nextInt();
	       int arr[]=new int[n];
	        for(int i=0; i<n; i++)
	            arr[i]=in.nextInt();
	        nextPermutation(arr,n);
	    }
	}
	static void swap(int arr[],int i,int j){
	   int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
	static void reverse(int arr[],int beg, int end){
	    while(beg<end){
	        int temp=arr[beg];
	        arr[beg++]=arr[end];
	        arr[end--]=temp;
	        }
	}
	static void nextPermutation(int arr[],int n){
	    int i=0;
	    for(i=n-2; i>=0; i--){
	        if(arr[i+1] >arr[i])
	            break;
	    }
	    if(i==0){
	        reverse(arr,i,arr.length-1);
	    }
	   else{
	       int min=arr.length-1;
	       for(int j=arr.length-1; j>i; j-- ){
	           if(arr[j]>arr[i]){
	            min=j;
	            break;
	           }
	       }
	       swap(arr,i,min);
	   }
	   reverse(arr,i+1,n-1);
	   StringBuffer br=new StringBuffer();
	   for(int value=0; value<arr.length; value++)
	    br.append(arr[value]+" ");
	    System.out.println(br);
	}
}
