class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        stack=[]
        for t in tokens:
            if t.isdigit() or len(t)>1:
                i = int(t)
                stack.append(i)
            else:
                second = int(stack.pop())
                first = int(stack.pop())
                
                if t=='+':
                    stack.append(first+second)
                elif t=='-':
                    stack.append(first-second)
                elif t=='*':
                    stack.append(first*second)
                elif t=='/':
                    stack.append(int(first/second))
    
    
        return stack[-1]