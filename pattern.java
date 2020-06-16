import java.util.*;
import java.io.*;
public class Pattern{
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        ArrayList<Integer> arr1=new ArrayList<Integer>(n);

        for(int i=0; i<n; i++)
            arr.add(scan.nextInt());
            Collections.sort(arr);
      //  System.out.println(arr);
      int result=0;
      for(int i=0; i<arr.size(); i++){
          for(int j=0; j<=i; j++){
             // if(i==0)
             result= (arr.get(j)*(j+1));
              System.out.print((arr.get(j)*(j+1)) +" ");
              // if(i>=1){
              //  System.out.println((arr.get(j)*(i+1)) +" ");
             // }
              //i--;
              arr1.add(result);
          }
          System.out.println();
         // System.out.println(arr1);
      }
      int sum=0;
      for(int m=0; m<arr1.size(); m++){
       sum+= arr1.get(m);   
      }
      System.out.println(sum);
    }
}