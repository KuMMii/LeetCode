class Solution {
    public String reverseVowels(String s) {
       StringBuilder sb = new StringBuilder(s);
        String[] word = new String[s.length()];
        word = s.split("");
        String vowels = "aeiouAEIOU";
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            //when the start pointer points vowel
            if (!vowels.contains(word[start])) {
                start++;
            }

            //when the end pointer points vowel
            if (!vowels.contains(word[end])) {
                end--;
            }

            if (start < end && vowels.contains(word[start]) && vowels.contains(word[end])) {
                sb.replace(start, start + 1, word[end]);
                sb.replace(end, end + 1, word[start]);
                start++;
                end--;
            }

        }

        System.out.println(sb.toString());

       return sb.toString();
        
    }
}