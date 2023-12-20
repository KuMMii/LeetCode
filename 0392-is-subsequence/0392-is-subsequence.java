class Solution {
    public boolean isSubsequence(String s, String t) {
        //if s is null
        if (s.length() == 0) return true;
        //if t is shorter than s
        if (s.length() > t.length()) return false;


        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (sChar[i] == tChar[j]) i++;
            j++;

        }//while

        if (i == s.length()) return true;
        return false;
    }
}