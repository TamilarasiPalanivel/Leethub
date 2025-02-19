class Solution {
    public int longestConsecutive(int[] nums) {
        int i,j,maxlen=0,currlen,currnbr;
        int n=nums.length;
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        Set <Integer> s =new HashSet<>();
        for(int a:nums)
        {
            s.add(a);

        }
        for(int b:s)
        {
            if(!s.contains(b-1))
            {
                currnbr=b;
                currlen=1;
                while(s.contains(currnbr+1))
                {
                    currnbr++;
                    currlen++;
                }

        maxlen=Math.max(currlen,maxlen);
            }
            
        }



        
    return maxlen;
    }
    
}