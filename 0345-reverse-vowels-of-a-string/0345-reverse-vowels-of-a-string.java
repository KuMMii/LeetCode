class Solution {
    public String reverseVowels(String s) {
       char[] word = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            //when the start pointer points vowel
            if (vowels.indexOf(word[start]) == -1) {
                start++;
            }

            //when the end pointer points vowel
            if (vowels.indexOf(word[end]) == -1) {
                end--;
            }

            if (start < end && vowels.indexOf(word[start]) != -1 && vowels.indexOf(word[end]) != -1) {
                char tmp = word[start];
                word[start] = word[end];
                word[end] = tmp;
                start++;
                end--;
            }

        }

        String ans = new String(word);
       return ans;
        
    }
}