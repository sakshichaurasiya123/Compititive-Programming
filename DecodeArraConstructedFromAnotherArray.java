import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int temp[]=new int[n];
	for(int i=0; i<n; i++)
	    temp[i]=in.nextInt();
	 decodeArray(temp,n);
	}
	static void decodeArray(int temp[],int n){
	    int k=(int)(Math.sqrt(8*n+1)+1)/2;
	    int org[]=new int[k];
        if(k==1)
            org[0]=temp[0];
        else if(k==2)
            org[0]=Math.abs(temp[0]-temp[1]);
        else
            org[0]=Math.abs(temp[0]+temp[1]-temp[k-1])/2;
        for(int i=1; i<k; i++)
            org[i]=temp[i-1]-org[0];

	    System.out.println(Arrays.toString(org));
	}
}
