package niuke;

import java.util.Scanner;

public class YingBiHuafeng {

    public static int countWays(int n){
        int money[] = {1, 2, 5, 10};
        int dp[] = new int[n+1];
        dp[0] = 1;
        for(int i = 0; i < money.length; i++){
            for(int j = money[i]; j <= n; j++){
                dp[j] = (dp[j] + dp[j - money[i]])%1000000007;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(countWays(n));
    }
}
