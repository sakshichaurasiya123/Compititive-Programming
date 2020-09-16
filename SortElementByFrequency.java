/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t-->0){
	        int n=in.nextInt();
	        ArrayList<Integer>arr=new ArrayList<Integer>();
	        for(int i=0; i<n; i++)
	            arr.add(in.nextInt());
	       HashSet<Integer> hs=new HashSet<Integer>(arr);
	       Map<Integer,Integer>map=new HashMap<Integer,Integer>(); 
	       for(Integer h:hs){
	          int key=h;
	          int value =Collections.frequency(arr,h);
	           map.put(key,value);
	       }
	       Collections.sort(arr,(n1,n2)->{
	           int freq1=map.get(n1);
	           int freq2=map.get(n2);
	           if(freq1!=freq2)
	                return freq2-freq1;
	           return n1-n2;
	       });
	       StringBuffer br=new StringBuffer();
	       Iterator itr=arr.iterator();
	       while(itr.hasNext())
	            br.append(itr.next()+" ");
	       System.out.println(br);
	       }
	    
	}
}
