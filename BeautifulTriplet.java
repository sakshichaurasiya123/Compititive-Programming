import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BeautifulTriplets {
    public static void main(String arg[]){
        Scanner scan=new Scanner(System.in);
        try{
        int n=scan.nextInt();
        int d=scan.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            arr.add(scan.nextInt());
        int count =0;
        for(int i=0; i<n; i++){
            for(int j=1; i<=n; j++){
                for(int k=2; k<=n; k++){
                    if((arr.get(j)-arr.get(i)==arr.get(k)-arr.get(j)) && 
                     (arr.get(k)-arr.get(j)==d))
                            count++;

                }
            }
        }
        System.out.println(count);
        }
        catch(Exception e){}
    }

}
