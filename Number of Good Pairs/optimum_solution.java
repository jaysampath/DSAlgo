 class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
		int[] freq = new int[101];
        for(int i : nums){
            count = count + freq[i];
            ++freq[i];
        }
		return count;
    }
}
