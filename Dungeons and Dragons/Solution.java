import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(2, 3, new long[]{1, 3, 0})));
    }

    static long[] solve(int N, long M, long[] dragons) {
        int k = 0;
        long current = dragons[k];
        while (M > 0) {
            if (current > 0) {
                for (int i = k; i <= k; i++) {
                    if (dragons[i] != 0) {
                        dragons[i]--;
                        M--;
                        break;
                    }
                }
            }
            if (k >= dragons.length -1 ) {
                k = 0;
                current = dragons[k];
            } else {
                current = dragons[k+1];
                k++;
            }
        }
        return dragons;
    }
}
