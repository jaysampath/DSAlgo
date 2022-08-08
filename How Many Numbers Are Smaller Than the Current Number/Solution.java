class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] freq = new int[101];
        for(int i:nums)
            freq[i]++;
        
        int[] res = new int[n];
        int sum=0;
        for(int i=0;i<101;i++){
            int currFreq = freq[i];
            freq[i] = sum;
            sum = sum + currFreq;
        }
        for(int i=0;i<n;i++)
            res[i]=freq[nums[i]];
        
        return res;
        
    }
}
