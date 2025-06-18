class Solution {
    public boolean search(int[] nums, int target) {
        int i,f=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                f=1;
            }
        }
        if(f==1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}