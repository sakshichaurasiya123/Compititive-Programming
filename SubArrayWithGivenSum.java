import java.lang.*;
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int s=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		       arr[i]=sc.nextInt();
		    
		    maxsum(arr,n,s);
		}
	}
		static void maxsum(int arr[],int n,int s){
		    int sum=0;
		    int i=0;
		    for(int j=0; j<arr.length; j++){
		        if(sum<s)
		            sum +=arr[j];
		        while(sum>s){
		            sum -=arr[i];
		            i++;
		        }
		        if(sum==s)
		        {
		            System.out.println((i+1)+" "+(j+1));
		            return;
		        }
		    }
		    System.out.println(-1);
		
	}
	
}
