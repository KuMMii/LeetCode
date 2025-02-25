class Solution:
    def searchBST(self, root: Optional[TreeNode], val: int) -> Optional[TreeNode]:
        if not root:
            return null
        
        while root:
            if root.val<val:
                if root.right:
                    root=root.right
                else:
                    return
            elif root.val>val:
                if root.left:
                    root=root.left
                else:
                    return
            else:
                return root
        