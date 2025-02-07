class Solution:
    def removeStars(self, s: str) -> str:
        stack=list(s)
        ans=''

        cnt=0
        while stack:
            pop = stack.pop()
            
            if pop=='*':
                cnt+=1
                while True:
                    starpop=stack.pop()
                    if starpop=='*':
                        cnt+=1
                    else:
                        stack.append(starpop)
                        break
                loop=cnt
                for i in range(loop):
                    peek=stack[-1]
                    if peek=='*':
                        break
                    stack.pop()
                    cnt-=1
            else :
                ans+=pop

        return ans[::-1]