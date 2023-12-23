class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;

        int n = nums.length;

        for (int i = 0; i <= n - 2; i++) {
            if (k > nums[i] && nums[i] != 0) {
                for (int j = i + 1; j <= n - 1; j++) {
                    if (nums[i] + nums[j] == k && nums[j] != 0) {
                        nums[i] = 0;
                        nums[j] = 0;
                        cnt++;
                        break;
                    }
                }
            }
        }


        return cnt;
    }
}