class Solution {
    public int pivotIndex(int[] nums) {
        
        int i, left=0;
        int right=Arrays.stream(nums).sum();
        
        for(i=0; i<nums.length; i++){
            right-=nums[i];
            if(i>0) left+=nums[i-1];
            
            if(left==right){
                return i;
            }
        }
        
        return -1;        
    }
}