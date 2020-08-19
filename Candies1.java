import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in=new Scanner(System.in);
        int  t=in.nextInt();
        for(int l=0; l<t; l++){
            int n=in.nextInt();
            ArrayList<Long>arr=new ArrayList<Long>();
            for(int i=0; i<n; i++)
                arr.add(in.nextLong());
            long sum=0;
            for(int i=0; i<arr.size(); i++)
                 sum +=arr.get(i); 
            long john=sum;
           // System.out.println("Sum : "+sum);
            
            ArrayList<Long> arr1=new ArrayList<Long>();
           for(int i=0; i<arr.size()-1; i++)
           {
               arr1.add(arr.get(i));
               
               if((i+1 )<arr.size()){
                   long sum1=0;
                   sum1 =arr.get(i)+arr.get(i+1);
                   arr1.add(sum1);
                   
                   
               }
           }
         //  System.out.println("John Array : "+arr);
          // System.out.println("Smith Array "+arr1);
           
           long smith= Collections.max(arr1);
            if(n<smith && smith<john)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}
