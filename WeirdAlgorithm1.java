import java.util.*;
public class WeiredA{
    public static void main(String args[]){
        try{
            Scanner scan = new Scanner(System.in);
            long n;
            n = scan.nextInt();
            System.out.print(n+" ");
            while(n > 1){
                if(n%2!=0){
                    n = (n*3)+1;
                }else{
                 n = n/2;        
                }
                System.out.print(n+" ");
                if(n==1)
                    break;
            }
            
        }catch(Exception e){
            
        }
    }
}
