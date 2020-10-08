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
	//	System.out.println("GfG!");
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++)
        arr[i]=in.nextInt();
    frequency(arr);
	}
	static void frequency(int arr[]){
	    LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
	    for(int i:arr)
	        map.put(i,map.getOrDefault(i,0)+1);
	   ArrayList<Entry<Integer,Integer>>occurance=new ArrayList<>(map.entrySet());
	   Collections.sort(occurance,new Comparator<Entry<Integer,Integer>>(){
	       public int compare(Entry<Integer,Integer>o1,Entry<Integer,Integer>o2){
	            return o2.getValue().compareTo(o1.getValue());}
	   });
	   System.out.println(Arrays.toString(arr));
	   for(Entry<Integer,Integer>entry:occurance){
	       int fre=entry.getValue();
	       while(fre>=1){
	           System.out.print(entry.getKey()+" ");
	           fre--;
	       }
	   }
	}
    
}
