import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	replaceelement(arr,n);
	}
	static void replaceelement(int arr[],int n){
	    for(int i=0; i<arr.length-1; i++){
	        int successor=-1;
	        int diff=Integer.MAX_VALUE;
	        for(int j=i+1; j<arr.length; j++){
	            if(arr[j]>arr[i] && (arr[j]-arr[i])<diff){
	                successor=arr[j];
	                diff=arr[j]-arr[i];
	            }
	        }
	        arr[i]=successor;
	    }
	    System.out.println(Arrays.toString(arr));
	}
}
