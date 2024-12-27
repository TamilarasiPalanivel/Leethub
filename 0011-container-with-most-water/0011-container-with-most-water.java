class Solution {
    public int maxArea(int[] height) {
       int left=0;
       int rig=height.length-1;
       int maxi=0;
       while(left<rig)
       {
        int cur=Math.min(height[left],height[rig])*(rig-left);
        maxi=Math.max(cur,maxi);
        if(height[left]<height[rig])
        {
            left++;
        }
        else
        {
            rig--;
        }
       }

       return maxi;
    }
}