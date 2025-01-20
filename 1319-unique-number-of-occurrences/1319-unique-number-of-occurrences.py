class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        numSet = set(arr)
        
        s=set()

        for i in numSet:
            count=0
            for j in arr:
                if i == j:
                    count+=1

            if count in s:
                return False
            s.add(count)
        return True

        