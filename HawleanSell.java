import java.util.Scanner;
import java.util.*;
public class Solution{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int p=in.nextInt();
        int d=in.nextInt();
        int m=in.nextInt();
        int s=in.nextInt();
        int sum=0;
        int count=0;
        if(p<s)
        {
            do{
                sum +=p;
                p=p-d;
                count++;
            }
            while(p>=m);
                while((sum+m)<=s){
                    sum +=m;
                    count++;
              
            }
            
        }
        System.out.println(count);
        
    
        
    }
	
}
