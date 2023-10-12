import java.util.Arrays;

public class Solution {
    private int solution(String S) {
        int n = S.length();
        boolean[] positionOccupied = new boolean[n];
        Arrays.fill(positionOccupied, true);
        int count = 0;
        for (int i = 0; i< n; i++) {
            char move = S.charAt(i);
            int targetPosition = i;
            if (move == '<') {
                targetPosition--;
            } else if (move == '>') {
                targetPosition++;
            } else {
                targetPosition = targetPosition - n -n;
            }
            if (targetPosition >= 0 && targetPosition < n) {
               if (!positionOccupied[targetPosition]) {
                   count++;
                   positionOccupied[targetPosition] = false;
               }
            } else {
                positionOccupied[i] = false;
                count++;
            }
        }
        return count;
    }

}
