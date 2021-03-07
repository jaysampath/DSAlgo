class Solution {
    public int findPeakElement(int[] nums) {
 
        // Using Binary Search to acheive run-time logarithmic complexity.
        int low = 0;
        int n = nums.length;
        int high = n-1;
        
        
        while(low<=high){
            
            int mid = low+(high-low)/2;
            
            //peak element at mid element
            if((mid ==0 || nums[mid-1] <nums[mid]) && (mid==n-1 || nums[mid+1]<nums[mid]) ){
                return mid;
            }
            //Peak element in left half of array
            else if(mid>0 && nums[mid-1]>nums[mid]){
                high =mid-1;
            }
            //Peak element in right half of array
            else if(mid<n-1 && nums[mid+1]>nums[mid]){
                low = mid +1;
            }
        }
        return -1;
    }
}
