class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0.0;
        double max = -1 * Double.MAX_VALUE;

        if (n == 1) return (double) nums[0];

        for (int j = 0; j < k; j++) {
            sum += nums[j];
        }
        max = Math.max(max, sum);

        for (int i = k; i < n; i++) {
            sum += nums[i] - nums[i - k];
            max = Math.max(max, sum);

        }
        return max / k;
    }
}