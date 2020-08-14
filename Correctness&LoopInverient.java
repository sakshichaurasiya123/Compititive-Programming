import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String arg[]){
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            arr.add(in.nextInt());
        Collections.sort(arr);
        Iterator itr=arr.iterator();
        while(itr.hasNext()){
        System.out.print(itr.next() +" ");
        }
        
    }
}
