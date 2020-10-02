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
	triplet(arr,sum,n);
	}
/*	static void triplet(int arr[],int sum,int n){
	    Arrays.sort(arr);
	    for(int i=0; i<n; i++){
	        int k=sum-arr[i];
	        int low=i+1;
	        int high=arr.length-1;
	        while(low<high){
	            if((arr[low]+arr[high])>k)
	                high--;
	            else if((arr[low]+arr[high])<k)
	                low++;
	            else{
	                System.out.println(arr[i]+" "+arr[low]+" "+arr[high]);
	                low++;
	                high--;
	            }
	        }
	    }
	}*/
	//Using Map
 	static void triplet(int arr[],int sum, int n){
	    Arrays.sort(arr);
	    Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	    for(int i=0; i<n; i++)
	        map.put(arr[i],i);
	        for(int i=0; i<n-1; i++){
	            for(int j=i+1; j<n; j++){
	                int k=sum-(arr[i]+arr[j]);
	                if(map.containsKey(k)){
	                    if(map.get(k)!=i && map.get(k)!=j)
	                        System.out.println(map.get(i)+" "+map.get(j)+" "+map.get(k));
	                }
	               
	            }
	            
	        }
	}
}
