import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        char ch[]=new char[n];
        for(int i=0; i<n; i++)
            ch[i]=in.next().charAt(0);
        int k=in.nextInt();
        int count=0;
        ArrayList<Integer>p=new ArrayList<Integer>();
        ArrayList<Integer>t=new ArrayList<Integer>();
        
        for(int i=0; i<n; i++){
           // int t=0,p=0;
            if(ch[i]=='P')
                p.add(i);
            else if(ch[i]=='T')
                t.add(i);
        }
        int l=0; 
        int r=0;
        while(l<t.size() && r<p.size()){
            if(Math.abs(t.get(l)-p.get(r))<=k)
            {    count++;
            l++;
            r++;
            }
           else  if(t.get(l)<p.get(r))
            l++;
            else
                r++;
        }
        
        System.out.println(count);
	}
}
