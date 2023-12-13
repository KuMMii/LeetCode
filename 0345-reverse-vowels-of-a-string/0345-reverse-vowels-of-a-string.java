class Solution {
    public String reverseVowels(String s) {
        List<Integer> listForIdx = new ArrayList<>();
        List<Character> listForChar = new ArrayList<>();

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||s.charAt(i) == 'e' ||s.charAt(i) == 'i' ||s.charAt(i) == 'o' ||s.charAt(i) == 'u'
                    || s.charAt(i) =='A' || s.charAt(i) =='E' || s.charAt(i) =='I' ||s.charAt(i) == 'O' || s.charAt(i) =='U') {
                listForIdx.add(i);
                listForChar.add(s.charAt(i));
            }
        }//for

        //reverse the list of char
        Collections.reverse(listForChar);

        for (int i = 0; i < listForIdx.size(); i++) {
            int idx = listForIdx.get(i);
            sb.replace(idx, idx+1, listForChar.get(i).toString());
        }

       return sb.toString();
        
    }
}