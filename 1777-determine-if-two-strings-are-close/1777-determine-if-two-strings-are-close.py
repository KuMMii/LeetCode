class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        # comparing chars & counts of the counts of chars
        c1, c2 = Counter(word1), Counter(word2)

        v1=Counter(c1.values())
        v2=Counter(c2.values())

        return v1==v2 and set(c1)==set(c2)