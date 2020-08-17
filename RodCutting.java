import java.util.*;
public class A{
	public static void main(String args[]){
      try{
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      ArrayList<Integer> arr=new ArrayList<Integer>();
      for(int i=0; i<n; i++)
        arr.add(in.nextInt());
     Collections.sort(arr);
     while(arr.size()>1){
         int r,rem;
          int mn= Collections.min(arr);
              System.out.println(arr.size());
        for(int i=0; i<arr.size()-1; i++){
        ArrayList<Integer> arr1=new ArrayList<Integer>();
            if(arr.get(i)==mn){
                arr1.add(mn);
                 arr.removeAll(arr1);
                }
        }
     }
      System.out.println(arr.size());
      }
      catch(Exception e){}
    }
}
