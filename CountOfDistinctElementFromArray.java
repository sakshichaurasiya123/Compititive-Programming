import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		 int k=in.nextInt();
		 findcount(arr,n,k);
	}
	static void findcount(int arr[],int n,int k){
	   for(int i=0; i<n-k+1; i++){
	       Set<Integer>set=new LinkedHashSet<Integer>();
	       for(int j=i; j<k+i; j++){
	       set.add(arr[j]);
	       }
	       System.out.println(set.size());
	   }
	} 
}
