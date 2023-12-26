class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int max = 0;
        String vowels = "aeiou";
        int cnt = 0;

        for (int i = 0; i < k; i++) {
            if (vowels.indexOf(chars[i]) >= 0) cnt++;

        }//for i
        max = Math.max(cnt, max);

        for (int i = k; i < n; i++) {
            if (vowels.indexOf(chars[i-k])>=0) cnt--;
            if (vowels.indexOf(chars[i])>=0) cnt++;

            max = Math.max(cnt, max);
        }
        
        return max;
    }
}