/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    int y=in.nextInt();
    int z=in.nextInt();
    int n=in.nextInt();
    int arr[]=new int [n+1];
    for(int i=0; i<=n; i++)
        arr[i]=-1;
    arr[0]=0;
    for(int i=0; i<=n; i++){
        if(arr[i]!=-1)
        {
            if(x+i<=n)
                arr[x+i]=Math.max(arr[x+i],arr[i]+1);
            if(y+i<=n)
                arr[y+i]=Math.max(arr[y+i],arr[i]+1);
            if(z+i<=n)
                arr[z+i]=Math.max(arr[z+i],arr[i]+1);
        }
    }
    for(int i=0; i<=n; i++)
        System.out.print(arr[i]+" ");
    System.out.println();
    System.out.println(arr[n]);
	}
}
