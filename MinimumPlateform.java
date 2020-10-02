import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int arrival[]=new int[n];
	int departure[]=new int[n];
	for(int i=0; i<n; i++)
	    arrival[i]=in.nextInt();
	for(int i=0; i<n; i++)
	    departure[i]=in.nextInt();
	 minimumPlateform(arrival,departure,n);
	}
	static void minimumPlateform(int arrival[],int departure[],int n){
	    Arrays.sort(arrival);
	    Arrays.sort(departure);
	    int plateform=1, start=1,end=0;
	    while(start<n){
	        if(arrival[start]<departure[end]){
	            start++;
	            plateform++;
	        }
	        else{
	            start++;
	            end++;
	        }
	    }
	    System.out.println(plateform);
	}
}
