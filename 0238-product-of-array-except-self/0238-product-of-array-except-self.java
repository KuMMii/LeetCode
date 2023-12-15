class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }

        int[] answer = new int[nums.length];


        //if product is not 0, return dividing each element
        if (product != 0) {
            for (int i = 0; i < nums.length; i++) {
                answer[i] = product / nums[i];
            }
        } 
        //for [0]
        else if (nums.length == 1) {
            answer[0] = 0;
        }


        //if the product is 0, then I have multiply each array
        else {
            for (int i = 0; i < nums.length; i++) {
                //if the element is not 0, then the answer is 0
                if (nums[i] != 0) {
                    answer[i] = 0;
                }
                //if the element is 0, multiply the numbers
                else {
                    int tmp = 1;
                    for (int j = 0; j < nums.length; j++) {
                        //multiply except self
                        if (i != j) {
                            tmp *= nums[j];
                        }
                    }
                    answer[i] = tmp;
                }
            }
        }

        return answer;
    }
}