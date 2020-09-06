import java.util.*;
public class MatchBrackets{
     static int matchBrackets(String s){
        Stack<Character> ct=new Stack<Character>();
        Stack<Integer> index=new Stack<Integer>();
        index.add(-1);
        int max=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                ct.add('(');
                index.add(i);
                System.out.println("ct push "+ct);
                System.out.println("index push "+index);
            }
            else{
                if(!ct.isEmpty() && ct.peek()=='('){
                    ct.pop();
                    index.pop();
                    max=Math.max(max,i-index.peek());
                    System.out.println(" max "+max);
                     System.out.println("ct pop " +ct);
                     System.out.println("index push "+index);
                }
                else
                    index.add(i);
            }
        }
        return max;
     }
  public static void main(String[] args) {
  Scanner in=new Scanner(System.in);
  int t=in.nextInt();
  while(t-->0){
  String s=in.next();
  System.out.println(matchBrackets(s));
         }
    }
}
