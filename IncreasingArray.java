import java.io.*;
import java.util.*;
import java.math.*;
 
class IncreasingArray{
    public static void main( String arg[]){
       try{
           Scanner scan = new Scanner(System.in);
             int n,pre;
        long steps=0;
        n =scan.nextInt();
        pre = scan.nextInt();
        System.out.println("Pre : "+pre);
        while(--n > 0){
            int value = scan.nextInt();
            System.out.println("Value : "+value);
            if(pre > value)
                steps+= pre-value;
                        System.out.println("Pre : "+pre);

            else{
                pre = value;
                System.out.println("Pre : "+pre);
            }

                
        }
        
        System.out.println(steps);
       }catch(Exception e){}
    }
 
}
