class Solution {
    public int maxSum(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int m = nums1.length;
        int n = nums2.length;

        long sum1 = 0, sum2 = 0;

        long result = 0;

        long mod = (long)1e9 + 7;

        while (i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                sum1 += nums1[i];
                i++;
            } else if (nums1[i] > nums2[j]) {
                sum2 += nums2[j];
                j++;
            } else {
                // equal case
                result += Math.max(sum1, sum2) + nums1[i];

                sum1 = 0;
                sum2 = 0;

                i++;
                j++;
            }
        }

        while(i < m) {
            sum1 += nums1[i];
            i++;
        }

        while(j < n) {
            sum2 += nums2[j];
            j++;
        }

        result += Math.max(sum1, sum2);

        return (int) (result % mod);
    }
}
