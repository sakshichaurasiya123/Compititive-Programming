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
		if(quadrate(arr,arr.length,sum,0))
		    System.out.println("Quadrate Exist");
		else
		    System.out.println("Quadrate not Exist");
	}
	static boolean quadrate(int arr[],int n,int sum,int count){
	    if(sum==0 && count==4)
	        return true;
	   if(count>4 || n==0)
	        return false;
	   return quadrate(arr, n - 1, sum - arr[n - 1], count + 1) ||quadrate(arr, n - 1, sum, count);
	 }
}
