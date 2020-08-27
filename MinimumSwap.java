import java.io.*; 
import java.util.*; 
class GfG { 
	static int minimumSwaps(int[] arr) 
	{ 
		int count = 0; 
		int i = 0; 
		while (i < arr.length) { 
			if (arr[i] != i + 1) { 

				while (arr[i] != i + 1) { 
				 int temp = arr[arr[i] - 1]; 
					arr[arr[i] - 1] = arr[i]; 
					arr[i] = temp; 
					count++; 
			       for(int k=0; k<arr.length; k++)
				     System.out.print(arr[k] +" ");
				System.out.println();
				} 
			} 
			i++; 
		} 
		return count; 
	} 
	public static void main(String[] args) 
	{ 
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
	System.out.println(minimumSwaps(arr)); 
	} 
} 
