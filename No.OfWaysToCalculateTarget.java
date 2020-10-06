/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
/*class Pair{
    Integer num;
    Character sign;
    Pair(Integer num,Character sign){
        this.num=num;
        this.sign=sign;
    }
    public String toString() {
		return "(" + this.sign + ")" + this.num + " ";
	}

}

class Main {
	public static void main (String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
		int target=in.nextInt();
		int sum=0;
		printways(arr,n-1,sum,target,new ArrayDeque<>());
	}
	static void printways(int arr[],int n,int sum,int target,Deque<Pair>list){
	    if(sum==target){
	        printlist(list,target);
	        return;
	    }
	   if(n<0)
	   return;
	   printways(arr,n-1,sum,target,list);
	   list.addLast(new Pair(arr[n],'+'));
	   printways(arr,n-1,sum+arr[n],target,list);
	   list.pollLast();
	   list.addLast(new Pair(arr[n],'-'));
	   printways(arr,n-1,sum-arr[n],target,list);
	   list.pollLast();
	}
	static void printlist(Deque<Pair>list,int target){
	    for(Pair p:list){
	        System.out.print(p+" ");
	   System.out.print(" = "+target);
	   
	   System.out.println();
	}
}*/

//Other way
public class CFG{
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
            arr[i]=in.nextInt();
        int target=in.nextInt();
        int ways=noOfWays( arr,n-1,target);
        System.out.println(ways+ " Ways.");
    }
    static int noOfWays(int arr[],int n,int target){
        if(target==0)
            return 1;
        if(n<0)
            return 0;
        int exclude=noOfWays(arr,n-1,target);
        int include=noOfWays(arr,n-1,target-arr[n])+noOfWays(arr,n-1,target+arr[n]);
        return include+exclude;        
    }
}
