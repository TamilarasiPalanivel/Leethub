class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Initialize pointers for nums1 and nums2 and the merged array index
        int i = m - 1;  // Pointer for the last element in nums1 (ignoring the zeros)
        int j = n - 1;  // Pointer for the last element in nums2
        int k = m + n - 1;  // Pointer for the last position in nums1

        // Start merging from the back of nums1 and nums2
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];  // Place nums1[i] at the end of nums1
            } else {
                nums1[k--] = nums2[j--];  // Place nums2[j] at the end of nums1
            }
        }

        // If nums2 still has remaining elements, copy them
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
