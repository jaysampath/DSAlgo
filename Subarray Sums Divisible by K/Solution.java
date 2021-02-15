class Solution {    
    public int subarraysDivByK(int[] A, int K) {
    //Arrays.sort(A);
        int k=K;
      int mod[] = new int[k]; 
        Arrays.fill(mod, 0); 
  int n=A.length;
        
        int cumSum = 0; 
        for (int i = 0; i < n; i++) { 
            cumSum += A[i]; 
  
            
            mod[((cumSum % k) + k) % k]++; 
        } 
  
       
        int result = 0; 
  
      
        for (int i = 0; i < k; i++) 
  
            
            if (mod[i] > 1) 
                result += (mod[i] * (mod[i] - 1)) / 2; 
  
        
        result += mod[0]; 
  
        return result;    
        
     
    }
}  
