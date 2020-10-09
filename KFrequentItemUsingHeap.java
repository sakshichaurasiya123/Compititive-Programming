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
	    kthFrequentItemUsingMaxHeap( arr, k);
	    kthFrequentItemUsingMinHeap( arr, k);
	}
	static void kthFrequentItemUsingMaxHeap(int arr[],int k){
	    Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	    for(int i:arr)
	        map.put(i,map.getOrDefault(i,0)+1);
	   PriorityQueue<Map.Entry<Integer,Integer>>heap=new PriorityQueue<>((n1,n2)->n2.getValue()-n1.getValue());
	   heap.addAll(map.entrySet());
	   List<Integer>list=new ArrayList<Integer>();
	   for(int i=0; i<k && !heap.isEmpty(); i++)
	        list.add(heap.poll().getKey());
	   System.out.println(list);
	}
	static void kthFrequentItemUsingMinHeap(int arr[],int k){
	    Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	    for(int i:arr)
	        map.put(i,map.getOrDefault(i,0)+1);
	    PriorityQueue<Map.Entry<Integer,Integer>>heap=new PriorityQueue<>((n1,n2)->n1.getValue()-n2.getValue());
      for(Map.Entry<Integer,Integer>entry:map.entrySet()){
          if(heap.size()<k)
            heap.add(entry);
          else
          {
              if(entry.getValue()>heap.peek().getValue())
              {
                  heap.poll();
                  heap.add(entry);
              }
          }
      }  
     List<Integer>list=new ArrayList<Integer>();
     while(!heap.isEmpty())
     list.add(heap.poll().getKey());
     System.out.println(list);
     
	}
}
