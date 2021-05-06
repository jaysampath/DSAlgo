

import java.util.*;


public class Intersection_of_two_Arrays {
    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int k = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                nums1[k++] = num;
                map.put(num, count - 1);
            }
        }

        return Arrays.copyOf(nums1, k);
    }
    public static void main(String[] args){
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        System.out.println(intersect(arr1,arr2));
    }

}
