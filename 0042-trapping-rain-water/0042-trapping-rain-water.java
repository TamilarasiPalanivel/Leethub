class Solution {
    public int trap(int[] height) {
        if(height.length<=2)
        {
            return 0;
        }
        int[] leftmx=new int [height.length];
        int[] rightmx=new int [height.length];
        int t=0,trapped;
        leftmx[0]=height[0];int i;
        for(i=1;i<height.length;i++)
        {
            leftmx[i]=Math.max(height[i],leftmx[i-1]);
        }
         rightmx[height.length-1]=height[height.length-1];
        for(i=height.length-2;i>=0;i--)
        {
            rightmx[i]=Math.max(height[i],rightmx[i+1]);

        }
        for(i=0;i<height.length;i++)
        {
            trapped=Math.min(leftmx[i],rightmx[i])-height[i];
            if(trapped>0)
            {
                t=t+trapped;
            }
        }
        return t;
    }
}