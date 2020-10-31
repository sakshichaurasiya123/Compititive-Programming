import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
	public static void main (String[] args) {
	   Scanner in=new Scanner(System.in);
	   int t=in.nextInt();
	   while(t-->0){
	       int n=in.nextInt();
	       int deadline[]=new int[n];
	       int profit[]=new int[n];
	       int id[]=new int[n];
	       for(int i=0; i<n; i++){
	           id[i]=in.nextInt();
	        deadline[i]=in.nextInt();
	        profit[i]=in.nextInt();}
	       jobsequence(id,deadline,profit,n);
	   }
	}
	static void jobsequence(int id[],int deadline[],int profit[],int n){
	    ArrayList<job> j=new ArrayList<job>();
	    for(int i=0; i<n; i++)
	        j.add(new job(id[i],deadline[i],profit[i]));
	    Collections.sort(j,(a,b)->b.profit-a.profit);
	   		int sum = 0;
	   		int count=0;
		int[] slot = new int[n];
		Arrays.fill(slot, -1);
	for (job jb: j)
		{
			for (int l= jb.deadline - 1; l >= 0; l--)
			{
				if (l < n && slot[l] == -1)
				{
					slot[l] = jb.id;
					sum += jb.profit;
					count++;
					break;
				}
			}
		}
        System.out.print(count+" "+sum);
        System.out.println();
	}
}
class job{
    int id;
    int deadline;
    int profit;
    job(int id, int deadline,int profit){
        this.id=id;
        this.deadline=deadline;
        this.profit=profit;
    }
}
