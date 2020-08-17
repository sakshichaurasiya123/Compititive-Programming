import java.util.*;
public class A{
	public static void main(String args[]){
      try{
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      ArrayList<Float> arr=new ArrayList<Float>();
      for(int i=0; i<n; i++)
            arr.add(in.nextFloat());
        int f=Collections.frequency(arr,Collections.min(arr));
        System.out.println(f);
      }
      catch(Exception e){}
    }
}
