class Solution:
    def maxLength(self, arr: List[str]) -> int:

        def uniqCheck(curSet, word):
            newSet = set(word)
            if len(word) != len(newSet):
                return False
            if len(curSet) != len(curSet.difference(newSet)):
                return False
            return True

        
        def backtrack(i, curSet):
            # Return
            if i == len(arr):
                return len(curSet)
            
            else:
                if not uniqCheck(curSet, arr[i]):
                    return backtrack(i+1, curSet)
                else:
                    return max(backtrack(i+1, curSet), backtrack(i+1, curSet.union(set(arr[i]))))
        
        return backtrack(0, set())

