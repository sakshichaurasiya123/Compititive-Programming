import java.math.BigInteger;
import java.util.Scanner;
 
public class ModifiedKrepaker {
 
    /**
     * Generate and display the MODIFIED kaprekar numbers within the specified range.
     */
     public static void main(String[] args) {
 
        // **** ****
         
        Scanner sc = new Scanner(System.in);
         
        // **** ****
         
        int p = sc.nextInt();
        sc.nextLine();
        int q = sc.nextInt();
 
   
        Boolean found = false;
         
        // **** loop once per number in the specified range ****
         
        for (int i = p; i <= q; i++) {
 
            // **** square the number ****
             
            BigInteger bigI     = new BigInteger(Integer.toString(i));
            BigInteger xSquare  = bigI.multiply(bigI);
 
            // **** generate a string representing the squared number ****
             
            String str = xSquare.toString();
         
            // **** prepend 0 (if odd number of characters) ****
             
            if ((str.length() % 2) == 1) {
                str = "0" + str;
            }
                     
            // **** split the string ****
             
            int len = str.length();
            String l = str.substring(0, len / 2);
            String r = str.substring(len / 2, len);
                 
            // **** convert right string to long ****
             
            long rr = Long.parseLong(r);
 
            // **** convert left string to long ****
             
            long ll = Long.parseLong(l);
             
            // **** add the numbers ****
             
            long sum = ll + rr;
         
            // **** check if this number is a Kaprekar ****
             
            if (sum == i) {
                System.out.print(i + " ");
                found = true;
            }
        }
 
        // **** check if Kaprekar number was NOT found ****
         
        if (!found) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println("");
        }
    }
     
    /**
     * Test code.
     */
  
}