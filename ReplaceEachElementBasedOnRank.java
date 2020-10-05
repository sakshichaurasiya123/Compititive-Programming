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
		 replacement(arr,n);
	}
	static void replacement(int arr[],int n){
	    Map<Integer,Integer>map=new TreeMap<Integer,Integer>();
	    for(int i=0; i<n; i++)
	        map.put(arr[i],i);
	        int rank=1;
	   for(var val:map.values())
	   arr[val]=rank++;
	  // System.out.println(map);
	   for(Map.Entry<Integer,Integer>maps:map.entrySet())
	      System.out.println(maps.getKey()+"  "+maps.getValue());
	  System.out.println(Arrays.toString(arr));
	}
}
