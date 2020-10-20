import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		int k=in.nextInt();
		int a=1,b=1;
		arr[0]=1;
		arr[1]=1;
		//Even Length
		if(n%2==0){
		    for(int i=2; i<=(n-2); i+=2){
		        a=a*2;
		        arr[i]=a;
		        b=b*3;
		        arr[i+1]=b;
		    }
		}
		//Odd Length
		else{
		    for(int i=2; i<=(n-2); i +=2){
		        a=a*2;
		        arr[i]=a;
		        b=b*3;
		        arr[i+1]=b;
		    }
		    a=a*2;
		    arr[n-1]=a;
		}
		System.out.println(arr[k]);
		System.out.println(Arrays.toString(arr));
	}
}
