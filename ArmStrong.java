import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		armstrong(num);
	}
	static void armstrong(int num){
	    int i=num;
	    int sum=0;
	    int s=0;
	    while(i>0){
	        int d=i%10;
	        s=(int)Math.pow(d,3);
	        sum +=s;
	        i=i/10;
	    }
	    if(sum==num)
	        System.out.println(""+num +" is armstrong");
	    else
	        System.out.println(""+num+" is not armstrong");
	    
	}
}
