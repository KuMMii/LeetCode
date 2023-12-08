class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         int MAX=0;
        for (int candy : candies) {
            MAX = Math.max(candy, MAX);
        }

        List<Boolean> ans=new ArrayList<>();
        
        for (int i=0; i<candies.length;i++) {
            if (candies[i]+extraCandies>=MAX) ans.add(i,true);
            else ans.add(i,false);
        }
        
        return ans;
    }
}