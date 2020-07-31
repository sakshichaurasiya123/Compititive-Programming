import java.io.*;
import java.util.*;
 
class Repetitions{
    // static int max=0;
    public static void main( String arg[]){
       try{
           Scanner scan = new Scanner(System.in);
           String str = scan.next();
           int temp=1,ans=1;
           for(int i=1;i<str.length();i++){
               if(str.charAt(i) == str.charAt(i-1))
                    ++temp;
                else{
                    ans = Math.max(ans,temp);
                    temp=1;
                }
           }
           ans = Math.max(ans,temp);
           System.out.println(ans);
           
       }catch(Exception e){}
    }
 
}
