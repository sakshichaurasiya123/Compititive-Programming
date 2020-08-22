import java.io.*;
import java.math.*;
import java.util.*;
public class Solution {
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0; i<n+2; i++)
            arr.add(0);
        for(int i=0; i<m; i++){
            int a=in.nextInt();
            int b=in.nextInt();
            int k=in.nextInt();
            int ad=arr.get(a)+k;
            arr.set(a,ad);
            int de=arr.get(b+1)-k;
            arr.set(b+1,de);
        }
       long sum=0;
       long max=0;
       for(int i=0; i<arr.size(); i++){
           sum +=arr.get(i);
           max =Math.max(sum,max);
       }
       System.out.println(max);
     
    }
}
