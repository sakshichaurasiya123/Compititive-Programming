import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String x=in.next();
	    String y=in.next();
		String z=in.next();
		int res=LCSLength(x,y,z,x.length(),y.length(),z.length());
	    System.out.println(res);
	    
	}
	static int LCSLength(String x ,String y, String z, int m,int n,int o){
	    if(m==0 || n==0 ||o==0)
	        return 0;
	    if(x.charAt(m-1)==y.charAt(n-1) && y.charAt(n-1)==z.charAt(o-1))
	        return LCSLength(x,y,z,m-1,n-1,o-1)+1;
	    return max(LCSLength(x,y,z,m-1,n,o),LCSLength(x,y,z,m,n-1,o),LCSLength(x,y,z,m,n,o-1));
	}
	static int max(int a,int b,int c){
	    int res=Math.max(Math.max(a,b),c);
	    return res;
	}
}
