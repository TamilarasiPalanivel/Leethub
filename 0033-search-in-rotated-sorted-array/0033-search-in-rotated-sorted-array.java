class Solution {
    public int search(int[] nums, int target) {
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            
        }
        return -1;
        
    }
}