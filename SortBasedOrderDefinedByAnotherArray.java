import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;
class GFG {
	public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr1[]=new int[n];
    for(int i=0; i<n; i++)
        arr1[i]=in.nextInt();
    int m=in.nextInt();
    int arr2[]=new int [m];
    for(int i=0; i<m; i++)
        arr2[i]=in.nextInt();
    frequency(arr1,arr2);
	}
	static void frequency(int arr1[],int arr2[]){
	    TreeMap<Integer,Integer>map=new TreeMap<>();
	    for(int i:arr1)
	        map.put(i,map.getOrDefault(i,0)+1);
	   int index=0;
	   for(int i:arr2){
	       int n=map.getOrDefault(i,0);
	       while(n-->0)
	           arr1[index++]=i;
	       map.remove(i);
	   }
	   for(var entry:map.entrySet()){
	       int count=entry.getValue();
	       while(count-->0)
	        arr1[index++]=entry.getKey();
	   }
	  System.out.println(Arrays.toString(arr1));
	}
}
