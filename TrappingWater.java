import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		waterDropping(arr,n);
	}
	static void waterDropping(int arr[],int n){
	    int left[]=new int[n-1];
	    int water=0;
	     left[0]=-1;
	    for(int i=1; i<n-1; i++)
	       left[i]=Math.max(left[i-1],arr[i-1]);
	   int right=-1;
	   for(int i=n-2; i>0; i--){
	       right=Math.max(right,arr[i+1]);
	       if(Math.min(right,left[i]) >arr[i])
	       water +=Math.min(right,left[i])-arr[i];
	   }
	   System.out.println(water);
	}
}
