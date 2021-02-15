class Solution {
    public boolean isValid(String s) {
        
        if(s.length()==0)
            return true;

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i ++){
          //  System.out.println(stack);
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.add(c);
            }
            else if (c == ')'){
                if (stack.size() == 0 || stack.pop() != '('){
                    return false;
                }
            }
            else if (c == ']'){
                if (stack.size() == 0 || stack.pop() != '['){
                    return false;
                }
            }
            else if (c == '}'){
                if (stack.size() == 0 || stack.pop() != '{'){
                    return false;
                }
            }
            else{
                continue;
            }//else
        //    System.out.println(stack);
        }//for i
        
        
        if (stack.size() == 0){
            return true;
        }
        else{
            return false;
    
   
    }
}
}
