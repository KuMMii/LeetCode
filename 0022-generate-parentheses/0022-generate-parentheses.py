class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        ans=[]
        def DFS(l:int, r:int, n:int, st:str):
            if len(st)==2*n:
                ans.append(st)
                return
            # left should be more than right
            elif l>=r:
                if l<n:
                    DFS(l+1,r,n,st+'(')
                    
                if r<n:
                    DFS(l,r+1,n,st+')')
            else:
                return

        DFS(0,0,n,'')
        return ans

        
        