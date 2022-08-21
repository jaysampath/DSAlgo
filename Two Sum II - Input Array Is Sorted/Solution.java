class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int left=0;
        int right =n-1;
        while(left<=right){
            int currSum = nums[left]+nums[right];
            
            if(target==currSum){
                return new int[]{left+1,right+1};
            }
            if(target < currSum){
                right--;
            }else{
                left++;
            }
            
        }
        return new int[]{};
    }
}
