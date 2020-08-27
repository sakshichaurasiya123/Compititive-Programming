import java.io.*;
import java.util.*;
import java.math.*;
class Solution {
    public static void main (String[] args) {
        Scanner in =new Scanner(System.in);
        int t=in.nextInt();
        for(int kl=0; kl<t; kl++){
        long s=in.nextLong();
        String result=Long.toBinaryString(s);
        
        String s1="";
         while(result.length()<32){
             result=0+result;
         }
         for(int i=0; i<result.length(); i++)
         {
             if(result.charAt(i)=='0')
                s1 +=1;
            else if(result.charAt(i)=='1')
                s1 +=0;
         }
         long finals=Long.parseLong(s1,2);
         System.out.println(finals);
        }
    }
}
