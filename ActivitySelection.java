/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int l=0; l<t; l++){
		    int n=in.nextInt();
		    int S[]=new int[n];
		    for(int i=0; i<n; i++)
		        S[i]=in.nextInt();
		    int F[]=new int[n];
		    for(int i=0; i<n; i++)
		          F[i]=in.nextInt();
		    activity(S,F,n);  
		}
	}
	static void activity(int S[],int F[],int n){
	    ArrayList<Meeting>m=new ArrayList<Meeting>();
		  for(int i=0; i<n; i++)
		    m.add(new Meeting(i,S[i],F[i]));
		  Comparator<Meeting>me=new Comparator<Meeting>(){
                public int compare(Meeting m1,Meeting m2){
                    return m1.end-m2.end ;
                }
		  };
		  Collections.sort(m,me);
		  ArrayList<Integer>res=new ArrayList<Integer>();
		  res.add(m.get(0).pos);
		  int timelimit=m.get(0).end;
		  for(int i=1; i<n; i++){
		      if(m.get(i).start >=timelimit){
		          res.add(m.get(i).pos);
		            timelimit=m.get(i).end;
		      }
		  }
		  for(int i=0; i<res.size(); i++)
		        System.out.print((res.get(i)+1)+" ");
		  System.out.println();
		  
	}
	
}
class Meeting {
    int pos;
    int start;
    int end;
    Meeting(int pos,int start,int end){
        this.pos=pos;
        this.start=start;
        this.end=end;
    }
}
