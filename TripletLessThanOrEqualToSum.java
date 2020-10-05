import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		int sum=in.nextInt();
		triplet(arr,n,sum);
	}
	static void triplet(int arr[],int n, int sum){
	    Arrays.sort(arr);
	    for(int i=0; i<arr.length-3; i++){
	        int low=i+1, high=arr.length-1;
	        while(low<high){
	            if((arr[i]+arr[low]+arr[high])>sum)
	                high--;
	            else{
	                for(int x=low+1; x<=high; x++){
	                    System.out.println(arr[i]+" "+arr[low]+" "+arr[x]);
	                }
	                low++;
	            }
	        }
	    }
	}
}
