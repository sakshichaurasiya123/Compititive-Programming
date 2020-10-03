import java.io.*;
import java.util.*;
import com.google.common.primitives.Ints; 

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		  arr[i]=in.nextInt();
		rearrange(arr,n);
	}
	//Using Extra Space
	static void rearrange(int arr[],int n){
	    int temp[]=new int[n];
	    for(int i=0; i<n; i++)
	        temp[i]=arr[i];
	   Arrays.sort(temp);
	   for(int i=0; i<n; i++){
	    temp[i]=Ints.indexOf(arr,temp[i]);
	   }
	   System.out.println(Arrays.toString(temp));
	}
	
}
