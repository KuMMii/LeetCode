class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPrice=min(prices)
        minIdx=prices.index(minPrice)
        maxProfit=0

        for i in range(minIdx, -1, -1):
            maxPrice=0
            if i is not (len(prices)-1):
                maxPrice=max(prices[i+1:])
            maxProfit=max(maxPrice-prices[i], maxProfit)
            

        return maxProfit