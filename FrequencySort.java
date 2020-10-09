import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
	    kthFrequentItemUsingMaxHeap( arr);
	}
	static void kthFrequentItemUsingMaxHeap(int arr[]){
	    Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	    for(int i:arr)
	        map.put(i,map.getOrDefault(i,0)+1);
	   PriorityQueue<Map.Entry<Integer,Integer>>heap=new PriorityQueue<>((n1,n2)->n2.getValue()-n1.getValue());
	   heap.addAll(map.entrySet());
	   List<Integer>list=new ArrayList<Integer>();
	   while(!heap.isEmpty()){
	       Map.Entry<Integer,Integer>entry=heap.poll();
	        list.add(entry.getKey());
	   }
	   System.out.println(list);
	}
}
