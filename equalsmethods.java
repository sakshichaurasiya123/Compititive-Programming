import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        //String
        String a=new String("Rani");
      String b=new String("Rani");
     //  String b= a.concat("Chaurasiya");
        System.out.println(a==b);
        System.out.println(a.equals(b));
        //String buffer
        StringBuffer ab=new StringBuffer("Rani");
        StringBuffer ab1=new StringBuffer("Rani");
       // ab.append("Chaurasiya");
        System.out.println(ab==ab1);
        System.out.println(ab.equals(ab1));
       
     }
}
