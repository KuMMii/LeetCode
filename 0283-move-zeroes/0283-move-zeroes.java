class Solution {
    public void moveZeroes(int[] nums) {
        int snowball = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                snowball++;
            } else if (snowball > 0) {
                int tmp = nums[i];
                nums[i] = nums[i - snowball];
                nums[i - snowball] = tmp;
            }
        }
    }
}