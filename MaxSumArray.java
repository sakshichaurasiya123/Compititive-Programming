import java.util.*;
import java.io.*;
public class Solution{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int x[]=new int[n];
        for(int i=0; i<n; i++)
            a[i]=in.nextInt();
        x[0]=a[0];
        x[1]=Math.max(a[0],a[1]);
        for(int i=2; i<a.length; i++){
            x[i]=a[i]+x[i-2];
            x[i]=Math.max(x[i],x[i-1]);
            x[i]=Math.max(x[i],a[i]);
        }
        int max=0;
        for(int i=0; i<x.length; i++){
            if(x[i]>max)
                max=x[i];
        }
        System.out.println(max);
        
    }
}
