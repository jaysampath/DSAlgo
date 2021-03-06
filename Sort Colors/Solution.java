class Solution {
    public void sortColors(int[] nums) {
        
        int len = nums.length;
        
        int left = 0,mid=0;
        int right = len-1;
        
        while(mid<=right){
            int temp=0;
            if(nums[mid]==0){
                temp = nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
                left++;
                mid++;
                continue;
            }
            if(nums[mid]==1){
                mid++;
                 continue;
            }
            if(nums[mid]==2){
                temp = nums[mid];
                nums[mid]=nums[right];
                nums[right]=temp;
                right--;
                 continue;
            }
            
        }
        
    }
}
