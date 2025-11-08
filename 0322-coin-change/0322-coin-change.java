import java.util.Arrays;

class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);  
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i]; j <= amount; j++) {
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
            }
        }

        if (dp[amount] > amount) return -1;
        return dp[amount];
    }
}
