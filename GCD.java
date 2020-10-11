/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int LCM(char[] str1,char[] str2,int s1,int s2){
        // if(s1==0 || s2==0 )
        //     return 0;
        // if(str1[s1-1] == str2[s2-1] )
        //     return 1+LCM(str1,str2,s1-1,s2-1);
        // else
        //     return Math.max( LCM(str1,str2,s1-1,s2),LCM(str1,str2,s1,s2-1) );
    
        int[][] min = new int[s1+1][s2+1];
        for(int i=0;i<=s1;i++){
            for(int j=0;j<=s2;j++){
                if(i==0 || j==0)
                    min[i][j] = 0;
                else if(str1[i-1] == str2[j-1])
                    min[i][j] = min[i-1][j-1]+1;
                else
                    min[i][j] = Math.max(min[i][j-1],min[i-1][j]);
                }
            }
            return min[s1][s2];
        }
	public static void main (String[] args) {
	    Scanner scan = new Scanner(System.in);
	    int t,s1,s2;
	    String str1,str2;
	    t = scan.nextInt();
	    while(t-- > 0){
	           s1 = scan.nextInt();
	           s2 = scan.nextInt();
	           str1 = scan.next();
	           str2 = scan.next();
	           char[] c = str1.toCharArray();
	           char[] cc = str2.toCharArray();
	           System.out.println(LCM(c,cc,s1,s2));
	    }
    }
}
