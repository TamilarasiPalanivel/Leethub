class Solution
{
    public int[] productExceptSelf(int[] nums)
    {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            res[i]=1;
        }
        int lp=1;
      int  rp=1;
        for(int i=0;i<n;i++)
        {
            res[i]*=lp;
            lp*=nums[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            res[i]*=rp;
            rp*=nums[i];
        }
        return res;
    }
}