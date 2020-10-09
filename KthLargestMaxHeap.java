import java.io.*;
import java.util.*;
class GFG {
    
    public static void minHeap(int arr[],int k){
        PriorityQueue<Integer>heap=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            heap.add(arr[i]);
            System.out.print(heap.peek()+" ");
        }
        System.out.println();
        for(int i=0; i<k-1; i++)
            heap.poll();
         System.out.print(heap.peek()+" ");
        //System.out.println();
    }
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int k=in.nextInt();
        minHeap(arr,k);
    }
}
