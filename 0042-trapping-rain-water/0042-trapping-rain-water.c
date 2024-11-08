int trap(int* height, int n) {
    int left = 0, right = n - 1, res =0;
    int lm = 0, rm = 0;
    
    while (left < right) {
        if (height[left] < height[right]) {
            if (lm < height[left]) {
                lm = height[left];
            } else {
                res += lm - height[left];
            }
            left++;
        } else {
            if (rm < height[right]) {
                rm = height[right];
            } else {
                res += rm - height[right];
            }
            right--;
        }
    }
    return res;
}
