class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        cnt = 0
        N = len(grid)
        revGrid=[]
        # make a new 2d array row and col is reversed
        for c in range(N):
            tmp=[]
            for r in range(N):
                tmp.append(grid[r][c])
            revGrid.append(tmp)
        
        # compare
        for g in revGrid:
            if g in grid:
                cnt+=grid.count(g)
        
        return cnt
        


        