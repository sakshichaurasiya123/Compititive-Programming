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
	    minimum(arr,n,k);
	    
   	}
   	//Brute Force Solution
   	/*static void minimum(int arr[],int n,int k){
   	    int i=0;
   	    int max=0;
   	    int diff=0;
   	    while(i<(n-k)){
   	        
   	        for(int j=i; j<k; j++){
   	            max +=arr[j];
   	        }
   	        i++;
   	        diff=Math.max(diff,max);
   	    }
   	    System.out.println(diff);
   	}*/
   	//Sliding Window Technique
   	static void minimum(int arr[],int n,int k){
   	    int wsum=0;
   	    int max=0;
   	    int j=0;
   	    Arrays.sort(arr);
   	    int start=arr.length-1,end=0;
   	    StringBuffer br=new StringBuffer();
   	    for(int i=n-1; i>=0; i--){
   	       wsum +=arr[i];
   	       br.append(arr[i]).append(" ");
   	       while(wsum>k && start>=i){
   	            //wsum =wsum-arr[start];
   	           // br.deleteCharAt(start);
   	         System.out.println(i+" "+start+"  sum : "+wsum);
   	         br.reverse();
   	        System.out.println(br); 
   	        return;
   	        
   	        }
   	      // if(wsum==k){
   	        
   	        //return;
   	       //}
   	        
   	        
   	    }
   	   	}
}
