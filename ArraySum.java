import java.util.Scanner;
public class ArraySum{
	public static void main(String arg[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=scan.nextInt();
		System.out.println("Enter array : ");
		int a[]=new int[n];
		int sum=0;
		for(int i=0; i<a.length; i++){
			a[i]=scan.nextInt();
		}
		for(int i=0; i<a.length; i++){
			sum +=a[i];
		}
		System.out.println(sum);
	}
}