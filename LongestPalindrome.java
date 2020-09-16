 import java.io.*;
 import java.util.*;
 public class PalDemo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PalDemo pd = new PalDemo();
        int t=in.nextInt();
        while(t-->0){
            String pal=in.next();
            System.out.println(pd.findLongestPalindrome(pal));
        }
    }
    
    public String findLongestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        // Validations end
        // Start with one char (starting) as a longest palindrome
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length(); i = i+1) {
            
            // get longest palindrome for odd length (center is i)
            String tmp = checkForEquality(s, i, i);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
    
            // get longest palindrome for even length (center is i, i+1)
            tmp = checkForEquality(s, i, i + 1);
            if (tmp.length() > longest.length()) {
                longest = tmp;
            }
        }
    
        return longest;
    }
    
    
    /**
     * In this method equality is checked starting from
     * the center moving one character left and one character
     * right from the center. If both chars are equal then the
     * next set of chars are checked.  
     *     
     */
    public String checkForEquality(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1 && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);    
    }
}
