class Solution {
    public boolean checkRecord(String s) {
        int c1=0,c2=0,r=0;
        
        for(int i=0;i < s.length();i++)
        {    
            
            if(s.charAt(i)=='A')
                c2++;
            
            if(c2>1)
                break;
        }
        try{
        for(int i=0;i< s.length();i++)
        {
            if(s.charAt(i)=='L'){
                c1++;
                 if(c1>2)
                {
                   r=1;
                    break;
                }
                if(s.charAt(i+1)!='L')
                    c1=0;
                
                
            }
           
        }
        }
        catch(Exception e)
        {}
        
        
        
        if(r==1 || c2>1)
            return false;
        else
            return true;
    }
}
