class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxSize = 0;

        while (left < right) {
            maxSize = Math.max(maxSize, (right - left) * Math.min(height[left], height[right]));
            if (height[left] < height[right]) left++;
            else if (height[left] > height[right]) {
                right--;
            } else {
                left++;
                right--;
            }
        }

        return maxSize;
    }
}