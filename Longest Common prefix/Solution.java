class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String curr=strs[0];
        
        for(int i=0;i<strs.length-1;i++){
            
            String a = curr;
            String b = strs[i+1];
            int j =0;
            String temp ="";
            while( j<Math.min(a.length(),b.length()) && a.charAt(j)==b.charAt(j)){
                
                temp += a.charAt(j);
                j++;
                
            }
           
            
            curr =temp;
            
            
            
            
        }
      
        return curr;
        
    }
}
