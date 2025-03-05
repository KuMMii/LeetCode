from queue import PriorityQueue
class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        pq=PriorityQueue()
        for i in nums:
            pq.put(i)
        
        for i in range(len(nums)):
            if i==len(nums)-k:
                return pq.get()
            pq.get()
