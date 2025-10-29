class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        key = key.replace(" ","").lower()
        s = set()
        al = 'abcdefghijklmnopqrstuvwxyz'
        d = {}

        i = 0
        for k in key:
            if k not in s:
                d[k] = al[i]
                i += 1
                s.add(k)
        res = ""
        for m in message:
            if m == " ":
                res += " "
            else:
                res += d.get(m)
        return res