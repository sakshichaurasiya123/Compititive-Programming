import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in = new Scanner(System.in);
    /*
	int binary[]=new int [100];
	int n=in.nextInt();
	int i=0;
	while(n>0){
	    binary[i++]=n%2;
	    n=n/2;
	    }
	    for(int j=i-1; j>=0; j--)
	        System.out.print(binary[j]);
	   */
    String a1=in.next();
    int n=Integer.parseInt(a1,2);
    System.out.println(n);
	}
}
