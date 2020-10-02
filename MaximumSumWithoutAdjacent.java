import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	    int prev=Integer.MIN_VALUE;
	 int max=maxsum(arr,0,n,prev);
	 System.out.println(max);
	}
	static int  maxsum(int arr[],int i,int n,int prev){
	    int max=0;
	    if(i==n)
	       return 0;
	    int inc=0;
	   int exc=maxsum(arr,i+1,n,prev);
	   if((prev+1)!=i){
	   inc=maxsum(arr,i+1,n,i)+arr[i];
	   }
	   return Math.max(exc,inc);
	   
	}
}
