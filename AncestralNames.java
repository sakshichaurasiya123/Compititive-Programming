import java.util.*;
import java.text.ParseException;
import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List; 
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class Maap {

     public static void main(String[] args) {

         HashMap <String,String> hmap = new HashMap<String,String>();
         Scanner in = new Scanner(System.in);
        int n=in.nextInt();
         for(int i=0;i<n;i++){

             String a=in.next();
             String b=in.next();

             hmap.put(a,b);
  //         System.out.println(hmap.get(b)+" "+hmap.get(a)); 
         }

         for(Map.Entry m:hmap.entrySet()) {    
             System.out.println(m.getKey()+" "+m.getValue());    
             
         }  
        
     }
}
