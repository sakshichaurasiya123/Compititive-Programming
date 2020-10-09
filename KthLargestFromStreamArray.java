import java.io.*;
import java.util.*;
class GFG {
    PriorityQueue<Integer>heap=new PriorityQueue<>();
     int kthlargest(int num,int k){
       if(heap.size()<k){
           heap.add(num);
           return heap.size()==k?heap.peek():-1;
       }
       if(num>heap.peek()){
           heap.poll();
           heap.add(num);
       }
       return heap.peek();
    }
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        GFG g=new GFG();
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int k=in.nextInt();
       for(int i=0; i<arr.length; i++){
           System.out.println(g.kthlargest(arr[i],k));
       }
    }
}
