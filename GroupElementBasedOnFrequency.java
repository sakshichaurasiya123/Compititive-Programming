import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		 group(arr,n);
	
	}
	static void group(int arr[],int n){
	    Map<Integer,Integer>map=new LinkedHashMap<>();
	    for(int i:arr)
	        map.put(i,map.getOrDefault(i,0)+1);
	    for(Map.Entry<Integer, Integer>km:map.entrySet())
	   {
	       int k=1;
	       for(int m=k; m<=km.getValue(); m++)
	           System.out.print(km.getKey()+" ");
	   }
	 }
}
