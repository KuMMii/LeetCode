class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        keypad=[[],[],['a','b','c'],['d','e','f'],
        ['g','h','i'],['j','k','l'],['m','n','o'],
        ['p','q','r','s'],['t','u','v'],['w','x','y','z']]

        letters=[]
        def DFS(letter: str, i: int):
            if len(digits)==0:
                return
            if i==len(digits):
                letters.append(letter)
                return
            for al in keypad[int(digits[i])]:
                DFS(letter+al, i+1)

        DFS('', 0)
        return letters