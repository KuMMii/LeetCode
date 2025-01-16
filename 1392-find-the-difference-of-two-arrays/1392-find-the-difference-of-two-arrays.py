class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        ans=[]
        ans=self.makeNewList(nums1, nums2, ans)
        ans=self.makeNewList(nums2, nums1, ans)
        return ans

    def makeNewList(self, list1: List[int], list2: List[int], ans: List[List[int]]) -> List[List[int]]:
        temp=[]
        for num in list1:
            if num not in list2 and num not in temp:
                temp.append(num)
        ans.append(temp)
        return ans

        