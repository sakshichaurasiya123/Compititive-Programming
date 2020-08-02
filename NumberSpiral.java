import java.util.Scanner;
public class NumberSpiral {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// try{
        int n = in.nextInt();
        int arr[][]= {{1,2,9,10,25},{4,3,8,11,24},{5,6,7,12,23},{16,15,14,13,22},{17,18,19,20,21}};
       
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        while(n-->0){
            int y=in.nextInt();
            int x=in.nextInt();
                System.out.println(arr[y][x]);
           
        }
   //  }
     //catch(Exception e){}
 
        
    }
}
