class Solution {
    public int removeDuplicates(int[] nums) {
        
        // O(n) memory
       /* Set<Integer> set = new TreeSet<>();
        
        for(int i =0; i<nums.length;i++){
            set.add(nums[i]);
        }
        
        System.out.println(set);
        int j=0;
        for(Integer i :set){
            nums[j] = i;
            j++;
        }
        
        System.out.println(Arrays.toString(nums));
        
        return set.size();
        
        */
        
        // O(1) memory
        
        if(nums.length<=1){
            return nums.length;
        }
        
        int j =0;
        for (int i=0; i < nums.length-1; i++){  
            if (nums[i] != nums[i+1]){  
                nums[j++] = nums[i];  
            }  
        }  
        nums[j++] = nums[nums.length-1];  
        return j;
    }
}
