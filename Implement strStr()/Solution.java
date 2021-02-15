class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()==0  && needle.length()==0)
            return 0;
        
        if(haystack.length()==0)
            return -1;
        if(needle.length()==0)
            return 0;
        
       int c1=0;
        int res=-1;
 //       res=haystack.indexOf(needle);

           if(haystack.contains(needle))
           {
               
             for(int i=0;i<haystack.length();i++)
             { 
                 if(needle.charAt(0)==haystack.charAt(i))
                 {
                     int k=i;
                     c1=0;
                     for(int j=0;j<needle.length();j++)
                     {
                         if(needle.charAt(j)==haystack.charAt(k))
                         {
                             c1++;
                             k++;
                         }
                     }
                     if(c1==needle.length()){
                         res=i;
                         break;
                     }
                 }
             }
            }
        else
            res=-1;
        
        
            return res;
        
        
    }
}
