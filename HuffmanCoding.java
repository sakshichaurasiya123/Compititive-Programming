/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class huffmanNode{
    char c;
    int item; 
    huffmanNode left;
    huffmanNode right;
}

class myComparator implements Comparator<huffmanNode>{
    public int compare(huffmanNode f1,huffmanNode f2){
        return f1.item-f2.item;
    }
}

class GFG {
	public static void printcode(huffmanNode root,String s){
	    if(root.left==null && root.right==null && Character.isLetter(root.c)){
	        System.out.print(s+" ");
	        return;
	    }
	   printcode(root.left, s+"0");
	   printcode(root.right,s+"1");
	}
	public static void main (String[] args) {
		//System.out.println("GfG!");
	    Scanner in=new Scanner(System.in);
	    String s=in.next();
	    int n=s.length();
	    int fr[]=new int[n];
	    for(int i=0; i<n; i++)
	        fr[i]=in.nextInt();
	    PriorityQueue<huffmanNode> priority=new PriorityQueue<huffmanNode>(n,new myComparator());
	    for(int i=0; i<n; i++){
	        huffmanNode hm=new huffmanNode();
	        hm.c=s.charAt(i);
	        hm.item=fr[i];
	        hm.left=null;
	        hm.right=null;
	        priority.add(hm);
	    }
	    huffmanNode root=null;
	    while(priority.size()>1){
	        huffmanNode x=priority.peek();
	            priority.poll();
	       huffmanNode y=priority.peek();
	        priority.poll();
	       huffmanNode f=new huffmanNode();
	       f.item=x.item+y.item;
	     //  f.c='-';
	       f.left=x;
	       f.right=y;
	       root=f;
	       priority.add(f);
	    }
	    printcode(root,"");
	   
	    }
	}
