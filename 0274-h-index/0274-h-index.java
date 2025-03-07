class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n=citations.length,i;
        for(i=0;i<n;i++)
        {
            int h=n-i;
            if(citations[i]>=h)
            {
                return h;
            }
        }
        return 0;


  }


}
