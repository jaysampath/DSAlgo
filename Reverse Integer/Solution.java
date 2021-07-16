class Solution {
    public int reverse(int x) {
        
        int res =0,temp=x;
        if(x>0){
            
            int rev = 0;
            while(temp>0){
                
                int pop = temp%10;
                
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7))                           return 0;
                
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) 
                return 0;
                
                rev = rev*10 + pop;
                temp = temp/10;
            }
            
            
            return rev;
        }else{
            temp = -1 * temp;
            
              int rev = 0;
            while(temp>0){
                int pop = temp%10;
                if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
                
                
                rev = rev*10 + pop;
                temp = temp/10;
            }
            
            res = -1 * rev;
        }
      return res;  
    }
}
