import java.util.*;
class Solution {
        static long mod = (long)1e9 + 7;
        static void numMusicPlaylists(int N, int L, int K) {
        long[][] dp = new long[N + 1][L + 1];
        for (int i = K + 1; i <= N; ++i)
            for (int j = i; j <= L; ++j)
                if ((i == j) || (i == K + 1))
                    dp[i][j] = factorial(i);
                else
                    dp[i][j] = (dp[i - 1][j - 1] * i + dp[i][j - 1] * (i - K))  % mod;
        for(int i=0; i<=N; i++){
            for(int j=0; j<=L; j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }
        System.out.println(dp[N][L]);
    }
   static long factorial(int n) {
        return n > 0 ? factorial(n - 1) * n % mod : 1;
    }
    public static void main(String arg[]){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int L=in.nextInt();
        int K=in.nextInt();
        numMusicPlaylists(N,L,K);
    }
}
