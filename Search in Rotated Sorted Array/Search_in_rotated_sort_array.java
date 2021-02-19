/*
There is an integer array nums sorted in ascending order (with distinct values). Prior to being passed to your
function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array
 is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).

For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the rotation and an integer target, return the index of target if it is in nums,
 or -1 if it is not in nums.

Example 1:
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1

Constraints:
1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104
*/

public class Search_in_rotated_sort_array {

    public static int search(int[] nums, int target) {

        int size = nums.length;
        int low = 0;
        int high = size-1;
        int mid =0;

        while(low<=high)
        {
            mid = (low+high)/2;
            if(target== nums[mid])
            {
                return mid;
            }
            //To check if left half is sorted
            if(nums[low]<=nums[mid])
            {
                // to check if the target lies in the left half region
                if(target>= nums[low] && target<= nums[mid])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1;
                }
            }
            else{ // i.e, right half is sorted

                // to check if the target lies in the right half region
                if(target>= nums[mid] && target <= nums[high])
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(arr,target));
    }

}
