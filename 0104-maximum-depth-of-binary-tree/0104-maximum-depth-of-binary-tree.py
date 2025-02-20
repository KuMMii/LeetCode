from collections import deque
class Solution:
    # Iterative DFS
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        stack=[[root,1]]
        level=0

        while stack:
            n,d=stack.pop()
            
            if n:
                level=max(level,d)
                stack.append([n.left,d+1])
                stack.append([n.right,d+1])
        return level