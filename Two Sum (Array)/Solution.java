class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[] res = new int[2];
       
        // O(n*n) solution
      /*  for(int i =0;i< nums.length;i++){
            
            int temp = nums[i];
            for(int j = i+1; j< nums.length; j++){
                
                if(temp+nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                    return res;
                   // break;
                }
            }
        } */
        
        // To reduce the complexity, we can sort and perform binary search. Here is O(nlogn) approach.
        
     /*
        int[] orgarr = Arrays.copyOf(nums,nums.length);
        
        
        Arrays.sort(nums);
        
        for(int i =0; i< nums.length;i++){
            
            int a = nums[i];
            
            int temp = Math.abs( target - a);
            
            int l =i+1;
            int r = nums.length-1;
            int mid = (l+r)/2;
            
            while(l<=r){
                if(nums[mid]==temp){
                    res[0] = i;
                    res[1] = mid;
                    break;
                }else if(nums[mid] < temp){
                    
                    l = mid+1;
                    mid = (l+r)/2;
                    
                }else if(nums[mid] >temp){
                    
                    r = mid-1;
                    mid = (l+r)/2;
                }
            }
            
            
        }
        
        
        for(int i=0; i< orgarr.length; i++){
            if(nums[res[0]] == orgarr[i]){
                res[0] = i;
                break;
            }
        }
        
        for(int i=0; i< orgarr.length; i++){
            if(nums[res[1]] == orgarr[i]){
                res[1] = i;
                break;
            }
        }
         */
        
        //The most efficient approach - O(n) using hashmap
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            int temp = target - nums[i];
            
            if(hm.containsKey(temp)){
                
                res[0] = hm.get(temp);
                res[1] = i;
                break;
                
            }else{
                hm.put(nums[i],i);
            }
            
        }
        
        return  res;
    }
    
    
}
