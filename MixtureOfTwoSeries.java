import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int k=in.nextInt();
		Arrays.fill(arr,0);
		for(int i=2; i<n; i+=2)
		    arr[i]=i;
		    int a=1;
		for(int i=3; i<n; i+=2)
	        arr[i]=a++;
		System.out.println(arr[k]);
		System.out.println(Arrays.toString(arr));
	}
}
