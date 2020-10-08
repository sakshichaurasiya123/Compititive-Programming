import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	segregateNumber(arr,n);
	}
	static void segregateNumber(int arr[],int n){
	   int start=0;
	    int Pindex=start;
	    for(int i=start; i<n; i++){
	        if(arr[i]<0){
	            swap(arr,i,Pindex);
	            Pindex++;
	        }
	        
	    }
	    System.out.print(Arrays.toString(arr));
	}
	static void swap(int arr[],int i,int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
}
