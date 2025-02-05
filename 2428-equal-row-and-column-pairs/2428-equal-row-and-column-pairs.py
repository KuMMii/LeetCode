class Solution:
    def equalPairs(self, grid: List[List[int]]) -> int:
        # make a hashmap
        m = defaultdict(int)
        cnt=0

        # convert the rows to key(String) and make the value to 1
        for row in grid:
            m[str(row)]+=1

        # convert the rows and add value to count
        N=len(grid)
        for c in range(N):
            col=[]
            for r in range(N):
                col.append(grid[r][c])
            cnt+=m[str(col)]

        return cnt