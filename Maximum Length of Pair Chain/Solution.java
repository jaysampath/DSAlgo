class Solution {
    public int findLongestChain(int[][] pairs) {
        // sort it according to second of the pair
        Arrays.sort(pairs, (a,b) -> a[1]-b[1]);
        int count = 1;
        int max = pairs[0][1];
        for (int i = 1; i< pairs.length ; i++) {
            if (pairs[i][0] > max ) {
                max = pairs[i][1];
                count++;
            }
        }
        return count;
    }
}
