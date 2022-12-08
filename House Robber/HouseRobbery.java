import java.util.Arrays;

public class HouseRobbery {

    public static void main(String[] args) {
        int[] houses = {2,7,9,3,1};
        System.out.println(String.format("Recursive top-down approach - %d", recursiveTopDown(houses, houses.length-1)));

        //recursive top down memo approach
        int[] memo = new int[houses.length];
        Arrays.fill(memo, -1);
        System.out.println(String.format("Recursive Memo top-down approach - %d", recursiveMemoTopDown(houses, houses.length-1, memo)));

        //iterative memo
        System.out.println(String.format("Iterative Memo - %d", iterativeMemo(houses)));

        //iterative memo
        System.out.println(String.format("Iterative Constant space - %d", iterativeConstantSpace(houses)));

    }

    private static int recursiveTopDown(int[] houses, int curr) {
        if (curr < 0) {
            return 0;
        }

        return Math.max( recursiveTopDown(houses, curr-1), recursiveTopDown(houses, curr-2)+houses[curr]);
    }

    private static int recursiveMemoTopDown(int[] houses, int curr, int[] memo) {
        if (curr < 0)
            return 0;

        if (memo[curr] != -1)
            return memo[curr];

        return memo[curr] = Math.max(
                recursiveMemoTopDown(houses, curr-1, memo),
                recursiveMemoTopDown(houses, curr-2, memo) + houses[curr] );
    }

    private static int iterativeMemo(int[] houses) {
        int[] memo = new int[houses.length+1];

        // Two options
        // 1 - Take current element
        // 2 - skip current element

        memo[0] = 0;
        memo[1] = houses[0];

        for (int i = 1; i < houses.length; i++) {
            memo[i+1] = Math.max(memo[i], memo[i-1]+houses[i]);
        }

        return memo[houses.length];
    }

    private static int iterativeConstantSpace(int[] houses) {
        //we are not actually using every element of the memo array
        if(houses.length == 0) return 0;
        if(houses.length == 1) return houses[0];

        //prev2 prev1 curr
        int prev2 = 0, prev1 = houses[0], curr = 0;

        for (int i = 1; i < houses.length; i++ ) {
            curr = Math.max(prev1, prev2+houses[i]);
            prev2 = prev1;
            prev1 = curr;
        }

        return curr;
    }
}
