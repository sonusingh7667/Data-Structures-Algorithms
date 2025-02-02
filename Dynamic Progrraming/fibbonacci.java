package Dynamic_Programming;

public class fibbonacci {

    public static int fibb(int n, int f[]){
        if (n == 0 || n == 1){
            return n;
        }
        if (f[n] != 0){
            return f[n];
        }
        f[n] = fibb(n-1, f) + fibb(n-2, f);
        return f[n];
    }


    public static int fibbTabulation(int n){
        int dp[] = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }


    public static void main(String[] args){

        int n = 5;
        int f[] = new int[n+1];
        System.out.println(fibb(n,f));
        System.out.println(fibbTabulation(n));
    }
}
