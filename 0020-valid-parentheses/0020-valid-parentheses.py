class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        map = {")":"(", "}":"{", "]":"["}

        for p in s:
            if p in map.values():
                stack.append(p)
            elif p in map.keys():
                if not stack or stack.pop()!=map.get(p):
                    return False
        return not stack