import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class StringRepetation {

    public static void main(String[] args) {
        //String
      Scanner in=new Scanner(System.in);
       String s=in.next();
       int result=1;
       int count=0;
       for(int i=0; i<s.length(); i++){
           int cur_count=1;
           for(int j=i+1; j<s.length(); j++){
               if(s.charAt(i)!=s.charAt(j))
                    break;
                 cur_count ++;
                
           }
           if(cur_count>count){
                count=cur_count;
                result=count;
                //System.out.println("Count : "+result);
           }
           /*else{
               result=count;
               //System.out.println("cur_count : "+result);
           }*/
           
                
       }
       System.out.println(result);
     }
}
