class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        if(target>nums[right])
            return right+1;
        if(target<nums[left])
            return 0;

        int mid=0;
        while(left<=right){
             mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target < nums[mid])
                right = mid-1;
            else
                left = mid +1;
        }

        if(target<nums[mid])
            return mid;
        
        return mid+1;
    }
}
