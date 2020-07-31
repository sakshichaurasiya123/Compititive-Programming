import java.util.*;
public class MissingNumber{
    public static void main(String args[]){
        try{
            Scanner scan=new Scanner(System.in);
             long n=scan.nextLong();
            long sum=0;
        for(int i=1;i<=n-1;++i){
            int value = scan.nextInt();
            sum+=value;
        }
        System.out.println( (n*(n+1)/2)-sum);
        }catch(Exception e){
            
        }
    }
}
