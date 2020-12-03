public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maximumGap(final int[] A) {
      int n=A.length;
    //  int left[]=new int[n];
      int right[]=new int[n];
    //  left[0]=A[0];
    //  for(int i=1; i<n; i++){
    //      left[i]=Math.min(A[i],left[i-1]);
    //  }
      right[n-1]=A[n-1];
      for(int i=n-2; i>=0; i--)
        right[i]=Math.max(A[i],right[i+1]);
        
        int max=0;
        int i=0,j=0;
        while(i<n && j<n){
            if(A[i]<=right[j]){
                max=Math.max(max,j-i);
                j++;
            }
            else
            i++;
        }
    
    return max;
    }
}
