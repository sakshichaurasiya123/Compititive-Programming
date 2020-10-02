import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arr[]=new int[n];
	for(int i=0; i<n; i++)
	    arr[i]=in.nextInt();
	int max_so_far=0;
	int max_ending=0,min_ending=0;
	int temp=0;
    for(int i:arr){
        temp=max_ending;
        max_ending=Math.max(i,Math.max(i*max_ending,i*min_ending));
        System.out.println("Max_Ending  "+max_ending);
        min_ending=Math.min(i,Math.min(i*temp,i*min_ending));
        System.out.println("Min_Ending  "+min_ending);
        max_so_far=Math.max(max_ending,max_so_far);
        System.out.println("max_so_far "+max_so_far);
    }
	System.out.println(max_so_far);
	}
}
