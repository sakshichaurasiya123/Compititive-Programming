import java.util.Scanner;
public class Permutation {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        } else {
            StringBuilder str = new StringBuilder();
            for (int i = 2; i <= n; i += 2) {
                str.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                str.append(i).append(" ");
            }
            System.out.println(str);
        }
    }
}
