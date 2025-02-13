# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans=[]
        if root:
            ans= self.traverse(ans, root)
        
        return ans





    def traverse(self, ans: List[int], node: TreeNode)-> List[int]:
        if node.left:
            self.traverse(ans, node.left)
        
        ans.append(node.val)

        if node.right:
            self.traverse(ans,node.right)

        return ans
        
