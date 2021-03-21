class Solution {
    static List<String> result = new ArrayList<String>();
    
    static void helper_method(int totalBrackets, int openBrackets, int closeBrackets, String curr){
        //base case
        if(curr.length()==totalBrackets){
            result.add(curr);
            return;
        }
        
        if(openBrackets<totalBrackets/2){
            helper_method(totalBrackets, openBrackets+1,closeBrackets,curr+"(");
        }
        
        if(closeBrackets<openBrackets){
            helper_method(totalBrackets, openBrackets,closeBrackets+1,curr+")");
        }
        
        
    }
    
    
    public List<String> generateParenthesis(int n) {
        
        result.clear();
        
        helper_method(2*n,0,0,"");
        
        return result;
        
    }
}
