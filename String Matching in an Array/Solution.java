class Solution {
     List<String> res = new ArrayList<String>() ;
    public List<String> stringMatching(String[] words) {
        
       
        try{
        for(int i=0;i< words.length; i++)
        {
            String str = words[i];
            for( int j=0 ; j<words.length ; j++)
            {
                if(str.length() < words[j].length() )
                {
                    if(words[j].contains(str))
                    {
                        if(already(str))
                        res.add(str);
                    }
                        
                }
            }
        }
    }
        catch(StringIndexOutOfBoundsException e)
        {
            
        }
        catch(ArrayIndexOutOfBoundsException ee)
        {
            
        }
      return res;   
    }
    public boolean already ( String s)
    {
        int test = 1;
        for(int i =0; i < res.size() ; i++ )
        {
            if ( s.equals(res.get(i)) ){
                test = 0;
                break;
            }
            else 
                test = 1;
            
            
            
        }
        if (test == 1)
            return true;
        else
            return false;
    }
   
}
