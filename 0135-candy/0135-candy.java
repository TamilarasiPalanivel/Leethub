class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candies=0,i;
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        for(i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                left[i]=left[i-1]+1;
            }
        }
        for(i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1])
            {
                right[i]=right[i+1]+1;
            }
        }
        for(i=0;i<n;i++)
        {
            candies=candies+Math.max(left[i],right[i]);
        }
return candies;
                
    }
}