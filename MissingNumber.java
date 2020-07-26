import java.io.*;
import java.util.*;

public class MissingNumber {

    public static void main(String[] args) {
        //String
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      ArrayList<Integer> arr= new ArrayList<Integer>();
      for (int i=0; i<n-1; i++)
        arr.add(in.nextInt());
     int total=(n*(n+1))/2;
      for(int i=0; i<arr.size(); i++){
      if(arr.get(i)==1)
         total -=1;
        else
            total -=arr.get(i);
      }
      System.out.println(total);
     }
}
