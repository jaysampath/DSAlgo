class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count=0;
        char[] ch = blocks.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(count==k)
                return 0;
            if(ch[i]=='B')
                count++;
            else
                count=0;
        }

        //already not present case
        int minCount =Integer.MAX_VALUE;
        for(int i=0;i<=ch.length-k;i++){
            count=0;
            for(int j=i;j<i+k;j++){
                if(ch[j]=='W')
                    count++;
            }
            if(count<minCount)
                minCount=count;
        }
        
        return minCount;
    }
}
