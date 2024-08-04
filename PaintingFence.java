class PaintingFence
{
    int mod=1000000007;
    long dp[];
    long countWays(int n,int k)
    {
        //code here.
          if(n==1){
            return k;
        }
        if(k==1){
            return 0;
        }
        dp=new long[n+1];

        return solvetab(n,k)%mod;
    }
      public  long solvetab(int n, int k) {
        if (n == 1) return k;

        long[] dp = new long[n + 1];
        dp[1] = k;
        if (n > 1) {
            dp[2] = add(k, mul(k, k - 1));
        }
        for (int i = 3; i <= n; i++) {
            dp[i] = add(mul(k - 1, (int) dp[i - 1]), mul(k - 1, (int) dp[i - 2]));
        }
        return dp[n];
    }
    long add(long a,long b){
        return (a+b)%mod;
    }
    long mul(long a,long b){
        return (a*b)%mod;
    }
    long solverec(int n,int k){
      
        if(n==2){
            return add(k,mul(k,k-1))%mod;
        }
        if(dp[n]!=-1){
            return dp[n]%mod;
        }
        long same=mul(k-1,solverec(n-2,k))%mod;
        long nonsame=mul(k-1,solverec(n-1,k))%mod;
        return dp[n]=(same+nonsame)%mod;
    }
    public static void main(String[] args) {
        PaintingFence obj=new PaintingFence();
        System.out.println(obj.countWays(7,3));
    }
}