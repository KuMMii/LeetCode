class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        if len(nums)<=1:
            return nums
        else:
            start = 0
            end = len(nums)

            while start<end:
                if nums[start]==0:
                    num = nums.pop(start)
                    nums.append(num)
                    end-=1
                else:
                    start+=1
            return nums
        
        