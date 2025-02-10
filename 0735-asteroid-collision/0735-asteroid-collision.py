class Solution:
    def asteroidCollision(self, asteroids: List[int]) -> List[int]:
        stack=[]
        
        for a in asteroids:
            # while stack is not empty and left one moves right, right moves left
            while stack and a<0 and stack[-1]>0:
                diff = a+stack[-1]
                # right is bigger
                if diff<0:
                    stack.pop()
                elif diff>0:
                    a=0
                else:
                    stack.pop()
                    a=0
            # if a is not 0
            if a:
                stack.append(a)

        return stack

        