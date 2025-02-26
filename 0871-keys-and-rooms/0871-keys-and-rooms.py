class Solution:
    def canVisitAllRooms(self, rooms: List[List[int]]) -> bool:
        visited=[False]*len(rooms)

        def DFS(idx: int):
            visited[idx]=True
            for i in rooms[idx]:
                if not visited[i]:
                    DFS(i)

        DFS(0)
        if False in visited:
            return False
        else:
            return True