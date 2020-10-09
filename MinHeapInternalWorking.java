/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    int size;
    int arr[]=new int[20];
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	GFG g=new GFG();
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	g.buildMinheap(arr);
	g.getMin();
	int m=g.removeIndex();
	System.out.println("Removed Element : "+m);
	g.insertValue(78);
	g.getMin();
	
	}
	 void buildMinheap(int arr[]){
	    this.arr=arr;
	    this.size=arr.length;
	    for(int i=size/2-1; i>=0; i--)
	        minheapify(i);
	}
	 void minheapify(int index){
	    int l=index*2+1;
	    int r=index*2+2;
	    int largest=index;
	    if(l<this.size && arr[l]<arr[largest])
	        largest=l;
	   if(r<this.size && arr[r]<arr[largest])
	        largest=r;
	    if(largest!=index){
	        swap(arr,largest,index);
	        minheapify(largest);
	    }
	}
	void getMin(){
	    int x=arr[0];
	    System.out.println(x);
	}
	public int removeIndex(){
	    int max=arr[0];
	    arr[0]=arr[size-1];
	    size--;
	    minheapify(0);
	    return max;
	    
	}
	void insertValue(int val){
	    arr[size]=val;
	    int index=size;
	    int parent=(index-1)/2;
	    while(parent>=0 && arr[parent]>arr[index]){
	        swap(arr,parent,index);
	        int t=parent;
	        index=parent;
	        parent=(t-1)/2;
	    }
	    size++;
	}
	void swap(int arr[],int i,int j){
	    int temp=arr[i];
	    arr[i]=arr[j];
	    arr[j]=temp;
	}
}
