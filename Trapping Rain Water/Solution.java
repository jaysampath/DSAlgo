class Solution {
    public int trap(int[] height) {
    
        //Trapping only possible if there are more than 2 buildings
        if(height.length <3)
            return 0;
            
        int result = 0;
        int s = height.length;
        //For storing left max height for each index.
        int[] lmax = new int[s];
        //For storing right max height for each index.
        int[] rmax = new int[s];
        
        lmax[0]= height[0];
        rmax[s-1] =height[s-1];
        
        for(int i = 1;i < s ;i++)
        {
            lmax[i] = Math.max(lmax[i-1],height[i]);
        }
        for(int i = s-2; i>0 ; i--)
        {
            rmax[i] = Math.max(rmax[i+1],height[i]);
        }
        
        for(int i = 0 ; i < s ; i++)
        {
            int temp = Math.min(lmax[i],rmax[i]);
            if( height[i]<temp )
                result += temp - height[i];
        }
        
        return result;
        
    }
}
