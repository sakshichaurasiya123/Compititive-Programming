/*package whatever //do not write package name here */

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
		
		//Naive Approach O(n^2)
		/*for(int i=0; i<n-1; i++){
		    for(int j=i+1; j<n; j++){
		        int result=arr[i]+arr[j];
		        if(result==sum)
		            System.out.println("pair found at index  "+i+"  and  "+j+" = ( "+arr[i]+" + "+arr[j]+" )");
		    }
		}*/
		
		// Using Sorting
	/*	Arrays.sort(arr);
		int low =0; 
		int high=arr.length-1;
		while(low<high){
		    if(arr[low]+arr[high]==sum){
		        System.out.println("Sum found at index "+low+" and "+high+" = ( "+arr[low]+" + "+arr[high]+" )");
	            return;
		}  
		   if((arr[low]+arr[high])<sum)
		    low++;
		   else 
		    high--;
		}*/
		// Using Hashing
		Map<Integer , Integer> mp=new LinkedHashMap<Integer,Integer>();
		int count=0;
		for(int i=0; i<arr.length; i++){
		    if(mp.containsKey(sum-arr[i])){
		        System.out.println("Value found at "+mp.get(sum-arr[i])+" and "+i);
		        count++;
		    }
		    mp.put(arr[i],i);
		}
		if(count==0)
		    System.out.println("Value Not Found");
		
		
	}
}
