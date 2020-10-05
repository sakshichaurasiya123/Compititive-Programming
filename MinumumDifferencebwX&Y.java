import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		 int x=in.nextInt();
		 int y=in.nextInt();
		    minimumdifference(arr,n,x,y);
	}
	static void minimumdifference(int arr[],int n,int x,int y){
	 int x_index=n,y_index=n;
	 int diff=Integer.MAX_VALUE;
	 for(int i=0; i<n; i++){
	     if(arr[i]==x)
	        x_index=i;
	    if(y_index!=n)
	        diff=Math.min(diff,Math.abs(x_index-y_index));
	 }
	 for(int i=0; i<n; i++){
	     if(arr[i]==y)
	        y_index=i;
	    if(x_index!=0)
	        diff=Math.min(diff,Math.abs(x_index-y_index));
	 }
	    if(diff!=Integer.MAX_VALUE)
	        System.out.println(diff);
	   else
	        System.out.println("Invalid Input");
	   
	 }
}
