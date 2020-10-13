/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
    static int count=0;
	static void solution(int i,int n,int k, int nos,ArrayList<ArrayList<Integer>>ans){
	    if(i>n){
	        if(nos==k)
	        {
	            count++;
	            System.out.println(count+"  ");
	            for(ArrayList<Integer>set:ans)
	                System.out.print(set+"  ");
	            System.out.println();
	        }
	        return;
	        //System.out.println();
	    }
	    for(int j=0; j<ans.size(); j++){
	        if(ans.get(j).size()>0){
	            ans.get(j).add(i);
	            solution(i+1,n,k,nos,ans);
	            ans.get(j).remove(ans.get(j).size()-1);
	        }	
	        else
	        {
	            ans.get(j).add(i);
	            solution(i+1,n,k,nos+1,ans);
	            ans.get(j).remove(ans.get(j).size()-1);
	            break;
	            }
	       }
	}
	public static void main (String[] args) {
	//	System.out.println("GfG!");
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int k=in.nextInt();
	ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
	for(int i=0; i<k; i++)
	    ans.add(new ArrayList<>());
	solution(1,n,k,0,ans);
	}

}
