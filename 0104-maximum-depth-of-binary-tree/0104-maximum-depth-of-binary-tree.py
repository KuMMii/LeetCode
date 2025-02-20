from collections import deque
class Solution:
    # BFS
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        q=deque()
        if root:
            q.append(root)
        cnt=0
        while q:
            for i in range(len(q)):
                n=q.popleft()
                if n.left:
                    q.append(n.left)
                if n.right:
                    q.append(n.right)
            cnt+=1
        return cnt