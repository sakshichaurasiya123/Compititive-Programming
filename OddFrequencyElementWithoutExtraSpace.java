import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		 mapping(arr,n);
	}
	// Using Extra Space
	/*static void mapping(int arr[],int n){
	    Map<Integer,Integer>map=new HashMap<Integer,Integer>();
	    for(int i:arr){
	        map.put(i,map.getOrDefault(i,0)+1);
	    }
	    System.out.println(map);
	    for(Map.Entry<Integer,Integer>ar:map.entrySet()){
	        if(ar.getValue()%2!=0)
	            System.out.println(ar.getKey());
	    }
	}*/
	//Without Using Extra Space
	static void mapping(int arr[],int n){
	    int XOR=0;
	    for(int i:arr){
	        XOR=XOR^i;
	    }
	    System.out.println(XOR);
	}
}
