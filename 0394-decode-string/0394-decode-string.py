class Solution:
    def decodeString(self, s: str) -> str:
        stack=[]
        
        for c in s:
            if c!=']':
                stack.append(c)
            else:
                sub=''
                # add char to substring
                while stack[-1]!='[':
                    sub=stack.pop()+sub
                # pop [
                stack.pop()

                # get number
                num=''
                while stack and stack[-1].isdigit():
                    num=stack.pop()+num
                # get multiplied substring and append it
                stack.append(int(num)*sub)
        return "".join(stack)
        


        