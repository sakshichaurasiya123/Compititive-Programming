public class Solution {
    public String[] fizzBuzz(int A) {
        String arr[]=new String[A];
        //StringBuffer br=new StringBuffer();
        for(int i=1; i<=arr.length; i++){
            if(i%3==0 && i%5!=0)
                arr[i-1]="Fizz";
           else if(i%5==0 && i%3!=0)
                arr[i-1]="Buzz";
           else if(i%3==0 && i%5==0)
                arr[i-1]="FizzBuzz";
            else 
                arr[i-1]=String.valueOf(i);
        }
     return arr;

    }
}
