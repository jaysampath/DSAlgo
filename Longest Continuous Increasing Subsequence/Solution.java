class Solution {
    public int findLengthOfLCIS(int[] nums) {
  //      Arrays.sort(nums);
       int res=1;
         int k = 1;
        int l=nums.length;
       if(nums.length==0)
           return 0;
        
        try{
           
            
            for(int i=0;i<nums.length;i++)
            {
             if(nums[i]<nums[i+1])
             {
                 k++;
                 
                 if(k>res)
                     res=k;
             }
              else
                    k=1;
                
                
                
            }
            
        }
        catch(Exception e)
        {}
     return res;   
    }
}
