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
		int sum=in.nextInt();
		coinChange(arr,sum);
	}
	static void coinChange(int arr[],int sum){
	    int table[]=new int[sum+1];
	   // table[0]=0;
	    for(int i=1; i<=sum; i++){
	        table[i]=Integer.MAX_VALUE;
	        int res=Integer.MAX_VALUE;
	        for(int c:arr){
	            if(i-c>=0)
	                res=table[i-c];
	           if(res!=Integer.MAX_VALUE)
	            table[i]=Math.min(table[i],res+1);
	        }
	    }
	    System.out.println(Arrays.toString(table));
	    System.out.println(table[sum]);
	}
}
