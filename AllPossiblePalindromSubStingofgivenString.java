/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String num=in.next();
	    subString(num);
	}
	static void subString(String num){
	    List<String>set=new ArrayList<String>();
        for(int i=0; i<num.length(); i++){
            for(int j=i+1; j<=num.length(); j++){
                if(!set.contains(num.substring(i,j)))
                set.add(num.substring(i,j));   
            }
        } 
        //System.out.println(set);
        palindrom(set);
	}
	static void palindrom(List<String>set){
	    for(int i=0; i<set.size(); i++){
	        String s=set.get(i);
	        StringBuffer br=new StringBuffer();
	        br.append(s);
	        br.reverse();
	        String res=new String(br);
	        if(res.equals(s))
	            System.out.print(s+" ");
	    }
	}
}
