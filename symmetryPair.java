import java.io.*;
import java.util.*;
Public class Pair{
    public int x,y;
        Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
}
class Main{
        static void symmetric(Pair[] pairs){
            Set<String>set=new HashSet<String>();
            for(Pair curr_pair:pairs){
            String p="{ "+curr_pair.x +" , "+curr_pair.y+" } ";
            set.add(p);
            String rev="{ "+curr_pair.y+" , "+curr_pair.x+" } ";
            if(set.contains(rev))
                System.out.println(p+" "+" | "+rev);
            }
        }
    public static void main(String arg[]){
       Pair[] pair={new Pair(3,4),new Pair(1,2),new Pair(5,2),new Pair(7,10),new Pair(4,3),new Pair(2,5)};
        symmetric(pair);
        
    }
}/*
public class CFG{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Map<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            map.put(in.nextInt(),in.nextInt());
        }
        symmetry(map,n);
    }
    public static void symmetry(Map<Integer,Integer>map,int n){
        for(Map.Entry<Integer,Integer>hm:map.entrySet()){
            if(hm.containsValue(hm.getKey())){
                System.out.print(hm.getKey()+" "+hm.getValue()+" ");
                System.out.print(hm.getValue()+" "+hm.getKey()+" ");
            }
        }
    }
}*/
