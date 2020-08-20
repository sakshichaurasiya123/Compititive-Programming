import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String arg[]){

    // Complete the candies function below.
Scanner in=new Scanner(System.in);
int n=in.nextInt();
long child[]=new long[n];
long candies[]=new long[n];

for(int i=0; i<n; i++)
    child[i]=in.nextLong();
for(int i=0; i<n; i++)
    candies[i]=1;
for(int i=1; i<child.length; i++){
    if(child[i]>child[i-1]){
        candies[i]=candies[i-1]+1;
    }
}
for(int i=child.length-2; i>=0; i--)
{
    if(child[i]>child[i+1])
        candies[i]=Math.max(candies[i], candies[i+1]+1);
}
long sum=0;
for(int i=0; i<candies.length; i++){
    sum +=candies[i];
}
//System.out.println();
System.out.println(sum);
    }
}
