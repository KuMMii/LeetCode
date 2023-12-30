class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int left = 0;
        int right;
        int zero = 0;

        //change a size of a window
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zero++;

            if (zero > 1) {
                if (nums[left] == 0) zero--;
                left++;
            }

            if (zero <= 1) max = Math.max(max, right - left);
        }


        return max == nums.length ? max - 1 : max;
    }
}