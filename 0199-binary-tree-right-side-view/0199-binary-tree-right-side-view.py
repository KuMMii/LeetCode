from collections import deque
class Solution:
    def rightSideView(self, root: Optional[TreeNode]) -> List[int]:
        q=deque()
        ans=[]
        if not root:
            return ans
        q.append(root)

        while q:
            for i in range(len(q)):
                n=q.popleft()
                if i==0:
                    ans.append(n.val)
                if n.right:
                    q.append(n.right)
                if n.left:
                    q.append(n.left)
        return ans

        