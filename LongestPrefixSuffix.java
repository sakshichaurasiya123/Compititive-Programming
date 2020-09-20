class Solution {
    int lps(String s) {
        int n=s.length();
       int lps[]=new int[n];
       lps[0]=0;
       int len=0;
       int i=1;
       while(i<n){
           if(s.charAt(i)==s.charAt(len))
           {
               lps[i]=len+1;
               len ++;
               i++;
           }
           else{
               if(len!=0){
                   len=lps[len-1];
               }
               else{
                   lps[i]=0;
                   i +=1;
               }
           }
       }
       return lps[n-1];
       
    }
}
