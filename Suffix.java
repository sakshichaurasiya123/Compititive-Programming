import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
       // StringBuffer br=new StringBuffer();
        ArrayList<String> arr=new ArrayList<String>();
        String str=in.next();
        char ch[]=str.toCharArray();
        int k=in.nextInt();
        for(int j=0; j<str.length(); j++){
            String result="";
        for(int i=j; i<ch.length; i++){
            result=result+ch[i];
        }
        arr.add(result);
    } 
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(k-1));
    }
}
