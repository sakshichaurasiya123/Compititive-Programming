/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		String X=in.next();
		String Y=in.next();
		if(isomorphic(X,Y))
		    System.out.println("X can be derived by Y");
		else
		    System.out.println("X can't be derived Y ");
	}
	static boolean isomorphic(String X,String Y){
	    if(X.length()!=Y.length())
	        return false;
	        Map<Character,Character>map=new HashMap<Character,Character>();
	        Set<Character>set=new HashSet<Character>();
	       for(int i=0; i<X.length(); i++){
	           char x=X.charAt(i);
	           char y=Y.charAt(i);
	           if(map.containsKey(x)){
	               if(map.get(x)!=y)
	                    return false;
	           }
	           else{
	               if(set.contains(y))
	                return false;
	           }
	           map.put(x,y);
	           set.add(y);
	           
	       }
	       return true;
	}
}
