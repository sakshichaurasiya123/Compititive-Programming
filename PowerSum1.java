import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        
        int r = 0;
        for (int i = 1; i < x; i++) {
            r += canSumTo(i, x, n);
        }
        System.out.println(r);
    }
    
    public static int canSumTo(int k, int x, int n) {
        int rest = (int) (x - Math.pow(k, n));
        if (rest == 0) {
            return 1;
        } else if (rest < 0) {
            return 0;
        }
        
        int r = 0;
        for (int i = k+1; i < rest; i++) {
            r += canSumTo(i, rest, n);
        }
        return r;
    }
}
