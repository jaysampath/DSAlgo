class Solution {
    public int singleNumber(int[] nums) {
     
        int result = 0;
         for (int i : nums){
             
            result = result ^ i;
        System.out.println(i+" "+result);
         }
        
        return result;
    }
}
