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
	   //Deque<Integer> out=new ArrayDeque<>();
      Stack<Integer> out=new Stack<>();
      distinct(arr,out,0,n,k);
    // Deque<Integer> out = new ArrayDeque<>();
	//	distinct(arr, out, k, 0,arr.length);

   	}
   /* Using Deque	
    static void distinct(int arr[],Deque<Integer>out,int i,int n,int k){
   	     if(out.size()==k){
   	        System.out.println(out);
   	        return;
   	    }
   	    for(int j=i; j<n; j++){
   	        out.addLast(arr[j]);
   	        distinct(arr,out,j,n,k);
   	        out.pollLast();
   	     
   	    }
   }*/
   	//Using Stack
   	static void distinct(int arr[],Stack<Integer>out,int i,int n, int k ){
   	    if(out.size()==k)
   	    {
   	        System.out.println(out);
   	        return;
   	    }
   	    for(int j=i; j<n; j++){
   	        out.add(arr[j]);
   	        distinct(arr,out,j,n,k);
   	        out.pop();
   	    }
   	}
}
