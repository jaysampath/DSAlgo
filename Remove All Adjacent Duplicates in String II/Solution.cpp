class Solution {
public:
    string removeDuplicates(string s, int k) {
        int n = s.size(),cut, cnt[n],vk=-1; memset(cnt,0,sizeof(cnt));
        
        for(int i = 0 ; i < n ; i++)
        {
            if(vk==-1 ||  s[vk]!= s[i])   //stack is empty or top of stack is not equal to s[i]
            {
                cut = 1 ;
                ++vk;
                s[vk] = s[i] ;
                cnt[vk] = 1 ;
            }
            else
            {
                cut++;
                ++vk;
                s[vk]=s[i]; cnt[vk] = cut ;
                if(cut == k)
                {
                    vk = vk - k;  //removing last k elements in the stack O(1) time.
                    
                    if(vk>=0)
                    {
                        cut = cnt[vk];
                    }
                }
            }
        }
		
        //while(n>vk+1){s.erase(s.begin()+vk+1);n--;}   //this give TLE. so, use below 1 line instead of while
        s.erase(s.begin()+vk+1,s.end());
        
        return s;
        
    }
};
