class Solution:
    def maxNumberOfBalloons(self, text: str) -> int:
        counter = Counter(text.lower())

        b = counter.get('b', 0)
        a = counter.get('a', 0)
        l = counter.get('l', 0) // 2
        o = counter.get('o', 0) // 2
        n = counter.get('n', 0)

        l = [b, a, l, o, n]

        return min(l)