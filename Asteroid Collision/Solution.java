class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> result = new Stack<Integer>();
        
        for(int element : asteroids){
            if(element >0){
                result.push(element);
            }
            else{
                while(result.size()>0 && result.peek()>0 && result.peek()< Math.abs(element) ){
                    result.pop();
                }
                if( result.size()==0 || result.peek()<0 ){
                     result.push(element);
                 }
               else{
                   if(result.peek()==Math.abs(element)){
                        result.pop();
                      }
                  }
            }

        }
      
        Object[] obj = result.toArray();
        int[] r = new int[obj.length];
        for(int i =0;i<obj.length;i++){
            r[i]=(int) obj[i];
        }
        return r;
    }
}
