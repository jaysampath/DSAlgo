class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        
        
        String result = "";
        if((numerator<0 && denominator>0) || (numerator>0 && denominator<0))
            result += "-";   
        System.out.println("result: "+result);
        long n = Math.abs(numerator);
        long d = Math.abs(denominator);
        System.out.println("result: "+result);
        long q = n/d;
        long rem = (n%d)*10;
        
        
         result += String.valueOf(Math.abs(q));
                           System.out.println("result: "+result);
        if(rem==0){
            
           
            return result;
        }
        
        
        
        HashMap<Long,Integer> map = new HashMap<>();
        result += ".";
        
        while(rem!=0){
            
            if(map.containsKey(rem)){
                
                int begin = map.get(rem);
                String p1 = result.substring(0,begin);
                String p2 = result.substring(begin,result.length()); 
                result = p1 + "(" + p2+ ")";
                return result;
            }
            
            map.put(rem,result.length());
            q = Math.abs(rem/d);
            result += String.valueOf(q);
            rem = (rem%d)*10;
            System.out.println("result: "+result+ " rem= "+rem);
            
        }
        
        
        
        return result;
        
    }
}
