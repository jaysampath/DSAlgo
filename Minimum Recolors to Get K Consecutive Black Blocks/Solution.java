class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        char[] ch = blocks.toCharArray();
        int minCount =Integer.MAX_VALUE;
        for(int i=0;i<=ch.length-k;i++){
            count=0;
            //iterate through k sized subarray from i
            for(int j=i;j<i+k;j++){
                if(ch[j]=='W')
                    count++;
            }
            //already present case.
            if(count==0)
                return 0;
            //not present find the min
            if(count<minCount)
                minCount=count;
        }
        
        return minCount;
    }
}
