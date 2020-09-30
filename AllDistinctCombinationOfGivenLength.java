import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	    int k=in.nextInt();
    distinct(arr," ",0,n,k);
   	}
   	static void distinct(int arr[],String out,int i,int n,int k){
   	    if(k>n)
   	        return;
   	     if(k==0){
   	        System.out.println(out);
   	        return;
   	    }
   	    int count=0;
   	    for(int j=i; j<n; j++){
   	        distinct(arr,out+" "+(arr[j]),j+1,n,k-1);
   	        count++;
   	    }
   	    //System.out.println(count);
   	}
}
