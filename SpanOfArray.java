/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		//System.out.println("GfG!");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int i=0; i<n; i++)
		    arr[i]=in.nextInt();
	 /*   int res[]=new int[n];
	    for(int i=0; i<n; i++){
	        int count=0;
	        for(int j=0; j<=i; j++){
	            if(arr[j]<=arr[i])
	                count++;
	        }
	        res[i]=count;
	    }
	    System.out.println(Arrays.toString(res));
	    */
	    Stack<Integer>s=new Stack<Integer>();
	    s.push(0);
	    for(int i=1; i<n; i++){
	        while(s.isEmpty()==false && arr[s.peek()]<=arr[i]){
                    s.pop();
	        }
	        int span=(s.isEmpty())?i+1:(i-s.peek());
	        System.out.println(span);
	        s.push(i);
	    }
	}
}
