import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CamelCase {

        public static void main(String arg[]){
            Scanner scan=new Scanner(System.in);
            String s=scan.nextLine();
            int count=0;
            for(int i=0; i<s.length(); i++){
                do {
                    count++;
                }
                while(s.charAt(i)>=65 && s.charAt(i)<=90);
            }
            System.out.println(count);
        }
    }
