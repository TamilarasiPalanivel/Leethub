import java.util.Collections;
import java.util.List;

class Solution {
    public int countWays(List<Integer> nums) {
        Collections.sort(nums);
        int n = nums.size();
        int count = 0;

        for (int k = 0; k <= n; k++) {
            boolean valid = true;

            if (k > 0 && nums.get(k - 1) >= k) {
                valid = false;
            }

            if (k < n && nums.get(k) <= k) {
                valid = false;
            }

            if (valid) {
                count++;
            }
        }

        return count;
    }
}
