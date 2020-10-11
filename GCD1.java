import java.util.*;
public class GCD {

 static int gcd(int a,int b){
        if(a == 0)
            return b;
        if(b==0)
            return a;
       return  gcd(b,a%b);
    }
    static int gcdNno(int[] arr,int n){
        if(n==1)
            return arr[0];
             int temp = arr[0];
        for(int i=1;i<n;i++)
            temp = gcd(temp,arr[i]%temp);
        return temp;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a;
        a = scan.nextInt();
        int[] arr = new int[a];
        for(int i=0;i<a;i++)
            arr[i] = scan.nextInt();
        System.out.println(gcdNno(arr,a));
        // b = scan.nextInt();
        // System.out.println(gcd(a,b));
        scan.close();
    }
    
}
