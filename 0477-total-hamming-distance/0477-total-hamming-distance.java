class Solution {
    public int totalHammingDistance(int[] nums) {
        int totalDistance = 0;
        int n = nums.length;

        for (int i = 0; i < 32; i++) {
            int count1 = 0;

            for (int num : nums) {
                if ((num & (1 << i)) != 0) {  
                     count1++;
                }
            }

            int count0 = n - count1;

            totalDistance += count0 * count1;
        }

        return totalDistance;
    }
}
