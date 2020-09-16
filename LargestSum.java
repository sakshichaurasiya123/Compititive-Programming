/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    ArrayList<String> arr=new ArrayList<String>();
	    for(int i=0; i<n; i++)
	        arr.add(in.next());
	   largest(arr,n);
	}
	static void largest(ArrayList<String>arr,int n){
	    StringBuffer br=new StringBuffer();
	    Collections.sort(arr,new Comparator<String>(){
	        public int compare(String x,String y){
	            String xy=x+y;
	            String yx=y+x;
	            return xy.compareTo(yx)>0?-1:1;
	        }
	        
	    });
	    for(int i=0; i<arr.size(); i++)
	        br.append(arr.get(i));
	   System.out.println(br);
	}
}
