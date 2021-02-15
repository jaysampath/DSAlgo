class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        //First checking for circuit to be completed or aren't.
        int netfuel = 0;
        for(int i =0; i<gas.length;i++)
        {
            netfuel += gas[i] - cost[i];
        }
        
        // if netfuel is less that zero i.e, no circuit is possible
        if(netfuel < 0)
            return -1;
        
        //Keeps track of start index of the circuit
        int startindex = 0;
        
        // keeps track of net fuel.         
        int reqfuel = 0;
        
        for(int i = 0; i < gas.length ; i++)
        {
            reqfuel += gas[i]-cost[i];           
            
            if(reqfuel<0)
            {
            // i.e.,current index cannot be starting point. Lets move to next index.
                reqfuel = 0;
                startindex = i+1;
            }
        }  
    
      return startindex;  
    }
}
