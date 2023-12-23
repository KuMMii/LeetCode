class Solution {
    public int maxOperations(int[] nums, int k) {
        int cnt = 0;
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (i < j) {
            if (k <= nums[i]) break;
            while (j > i) {
                int sum = nums[i] + nums[j];
                if (sum == k) {
                    cnt++;
                    break;
                } else if (sum > k) j--;
                else i++;
            }
            i++;
            j--;

        }


        return cnt;
    }
}