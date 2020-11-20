public static long[] printFibb(int n) 
{
    long dp[]=new long[n];
    dp[0]=1;
    if(n==1)
    {
        return dp;
    }
    if(n==2){
    dp[1]=1;
    return dp;
    }
    else if(n>2){
        dp[1]=1;
    for(int i=2; i<n; i++){
        dp[i]=dp[i-2]+dp[i-1];
    }
    return dp;
    }
    return dp;
}
