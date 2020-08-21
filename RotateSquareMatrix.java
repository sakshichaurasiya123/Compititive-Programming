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
        int m=in.nextInt();
        int n=in.nextInt();
        int arr[][]=new int[m][n];
        int k=in.nextInt();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j]=in.nextInt();
            }
            System.out.println();
        }
        while(k>0){
         int length=arr.length-1;
         for(int i=0; i<length/2; i++){
             for(int j=i; j<length-i; j++){
                 int p1=arr[i][j];
                 int p2=arr[j][length-i];
                 int p3=arr[length-j][length-i];
                 int p4=arr[length-j][i];
                 arr[j][length-i]=p1;
                 arr[length-j][length-i]=p2;
                 arr[length-j][i]=p3;
                 arr[i][j]=p4;
             }
         }
         k--;
        }
         for(int i=0; i<m; i++){
             for(int j=0; j<n; j++){
                 System.out.print(arr[i][j] +" ");
             }
             System.out.println();
         }
        
    }
}
