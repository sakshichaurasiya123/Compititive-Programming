import java.util.Scanner;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
            ArrayList<Integer> arr=new ArrayList<Integer>();
            for(int j=0; j<n; j++)
                arr.add(in.nextInt());
            for(int i=0; i<arr.size(); i++)
            {
                for(int j=0; j<i; j++){
                if(arr.get(i) < arr.get(j)){
                    Collections.swap(arr, i,j);
                }
            
                }
                if(i >=1){
                    Iterator itr= arr.iterator();
                    while(itr.hasNext())
                    System.out.print(itr.next() +" ");
                    System.out.println();
                }
                
                
            }
        
	}
}
