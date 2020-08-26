import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String s=in.next();
		char ch[]=s.toCharArray();
		HashSet<Character> hs=new HashSet<Character>();
		for(int i=0; i<ch.length-1; i++){
		    char c=ch[i];
		    if(hs.contains(c))
		        System.out.println(c);
		      else
		        hs.add(c);
		}
	//	System.out.println(-1);
	}
}
