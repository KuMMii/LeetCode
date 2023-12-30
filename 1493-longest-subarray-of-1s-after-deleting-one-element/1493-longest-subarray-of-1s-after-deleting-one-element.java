class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int left = 0;
        int right;
        int zero = 0;
        int one = 0;

        //find out if the array is mixed or not
        for (int num : nums) {
            if (num == 0) zero++;
            else one++;

            if (zero > 0 && one > 0) break;
        }
        if (zero == 0) return nums.length - 1;
        if (one == 0) return 0;

        //change a size of a window
        zero = 0;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zero++;

            if (zero > 1) {
                if (nums[left] == 0) zero--;
                left++;
            }

            if (zero <= 1) max = Math.max(max, right - left);
        }


        return max;
    }
}