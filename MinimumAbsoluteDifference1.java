import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
    // Complete the minimumAbsoluteDifference function below.
       long n=in.nextLong();
      //  ArrayList<Long> arr1=new ArrayList<Long>();
        ArrayList<Long> arr=new ArrayList<Long>();
        for(long i=0; i<n; i++)
            arr.add(in.nextLong());
            long min=0;
        for(int i=0; i<arr.size()-1; i++){
            for(int j=i+1; j<arr.size(); j++)
            {
                long result=Math.abs(arr.get(i)-arr.get(j));
                 min=Math.min(result,min);
            }
        }
         System.out.println(min);
               
        
       // System.out.println(Collections.min(arr1));
       

    }

}
