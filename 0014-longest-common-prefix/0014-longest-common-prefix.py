class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs)==1:
            return strs[0]

        shortest = min(strs, key=len)
        print(shortest)
        if len(shortest)==0:
            return ""
        temp=''
        for i in range(len(shortest)):
            temp+=shortest[i]
            print(temp)
            for s in strs:
                print(s.startswith(temp))
                if not s.startswith(temp):
                    if len(temp)==0:
                        return ""
                    else:
                        return temp[:len(temp)-1]
        return temp

            
        