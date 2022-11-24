/*
Given a number N. Find the minimum number of operations required to
 reach N starting from 0. You have 2 operations available:

        Double the number
        Add one to the number

        Example 1:

        Input:
        N = 8
        Output: 4
        Explanation: 0 + 1 = 1, 1 + 1 = 2,
        2 * 2 = 4, 4 * 2 = 8
*/

public class MinimumOperations {
    public static void main(String[] args) {
        int N = 7;
        System.out.println(findMinOperations(N));
    }

    private static int findMinOperations(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            dp[i] = Integer.MAX_VALUE;

            if (i % 2 == 0)
            {
                int x = dp[i / 2];
                if (x + 1 < dp[i])
                {
                    dp[i] = x + 1;
                }
            }

            int x = dp[i - 1];
            if (x + 1 < dp[i])
            {
                dp[i] = x + 1;
            }
        }
        return dp[n];
    }


}
