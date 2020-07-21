import java.util.*;
public class Countnoofpair{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        ArrayList <Integer> arr2=new ArrayList<Integer>();
        for(int i=0; i<n; i++)
            arr.add(in.nextInt());
        //System.out.println("arr : "+arr);
        for(int i=0; i<arr.size(); i++){
            ArrayList<Integer> arr1=new ArrayList<Integer>();
            int num=arr.get(i);
            int n1=num / 100 % 10;
            int n2=num / 10 % 10;
            int n3=num % 10;
            arr1.add(n1);
            arr1.add(n2);
            arr1.add(n3);
         //   System.out.println("arr1 : "+arr1);
           int  max=Collections.max(arr1);
            int min=Collections.min(arr1);
            int result=max*11+min*7;
            arr2.add(result);
        }
        //.out.println("Arr2 "+arr2);
        int count=0;
        for(int i=0; i<arr2.size()-2; i++){
            //for(int j=1; j<arr2.size(); j+2){
            if(i%2==0){
                int num1=arr2.get(i);
                int num2=arr2.get(i+2);
                int n1=num1/10%10;
                int n2=num2/10%10;
                int count1=0;
                while(n1 !=0){
                    n1/=10;
                    count1=0;
                }
              /*  if(count1>2){
                    
                }*/
                
                
                if(n1==n2)
                    count++;
            }
            else if(i%2!=0)
            {
                int num1=arr.get(i);
                int num2=arr.get(i+2);
              //  int n1=num1/10%10;
                int n2=num2/10%10;
                
                int count1=0;
                while(num1 !=0){

                    num1/=10;
                    count1++;
                }
                System.out.println("count1 : "+count1);
                if(count1 >2){
                    n1 =num1/100%10;
                }
                else if(count1==2)
                    n1=num1/10%10;

                    int count2=0;
                    while(num1 !=0){
    
                        num1/=10;
                        count2++;
                    }
                    System.out.println("count2 : "+count2);
                    if(count2 >2){
                        n2 =num2/100%10;
                    }
                    else if(count2==2)
                        n2=num1/10%10;

                    
         
                
            }
        }
        
        System.out.println("Count : "+count);
    }
    
    
}
