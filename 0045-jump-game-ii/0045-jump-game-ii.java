class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0; 
        
        int count = 0; 
        int left = 0, right = 0; 
        int mxIdx = nums[0]; 

        while (left < n) {
            left = right + 1; 
            right = Math.min(mxIdx, n - 1); 
            count++; 
            
            if (right >= n - 1) {
                return count; 
            }
                        while (left <= right) {
                mxIdx = Math.min(Math.max(mxIdx, left + nums[left]), n - 1);
                left++;
            }
        }
        return count;
    }
}