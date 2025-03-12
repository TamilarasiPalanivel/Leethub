class Solution {
    public int maximumCount(int[] nums) {
int posc=0,i,negc=0;
for(i=0;i<nums.length;i++) 
{
    if(nums[i]==0)
    {
        continue;
    }
    if(nums[i]>0)
    {
        posc++;
    }

    else if(nums[i]<0)
    {
        negc++;
    }
}   
int max=Math.max(posc,negc);
  return max;
    }
}