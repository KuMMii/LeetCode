class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = 0;
        int zeros = 0;
        int right;
        int left = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zeros++;

            if (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }

            if (zeros <= k) max = Math.max(max, right - left + 1);
        }

        return max;
    }
}