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
		kthsmallest(arr,k);
	}
	//Using min heap
	static void kthsmallest(int arr[],int k){
	    PriorityQueue<Integer> heap=new PriorityQueue<>();
	    for(int i=0; i<arr.length; i++)
	        heap.add(arr[i]);
	   for(int i=0; i<k-1; i++)
	        heap.poll();
	    System.out.println(heap.peek());
	}
	//Using MaxHeap
   /* static void kthsmallest(int arr[],int k){
	    PriorityQueue<Integer> heap=new PriorityQueue<>(Collections.reverseOrder());
	    if(arr.length<k)
	        System.out.println(-1);
	    for(int i=0; i<k; i++)
	        heap.add(arr[i]);
	   for(int i=k; i<arr.length; i++){
	       if(arr[i]<heap.peek()){
	           heap.poll();
	           heap.add(arr[i]);
	       }
	   }
	   System.out.println(heap.peek());
	    
	}*/
}
