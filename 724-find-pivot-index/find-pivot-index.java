class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for (int piv = 0; piv < n; piv++) {
            int left_sum = 0, right_sum = 0;
            for (int i = 0; i < piv; i++) {
                left_sum += nums[i];
            }
            for (int j = piv + 1; j < n; j++) {
                right_sum += nums[j];
            }
            if (left_sum == right_sum) return piv;
        }
        return -1;
    }
}