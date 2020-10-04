import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int arr[]=new int[n];
	    for(int i=0; i<n; i++)
	        arr[i]=in.nextInt();
	    findAllTriplets(arr,n);
	}
    static void findAllTriplets(int[]arr,int n){
	   if(arr.length<3)
	       return;
	   for(int j=1; j<arr.length-1; j++){
	       int i=j-1, k=j+1;
	       while(i>=0 && k<arr.length){
	           if(arr[i]+arr[k]==2*arr[j]){
	                System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
	                i--;
	                k++;
	           }
	           else if(arr[i]+arr[k]<2*arr[j])
	            k++;
	           else
	            i--;
	       }
	   }
	}
}
