class Solution {
    public String reverseWords(String s) {
        //pointer 만들기
        int pointer = 0;
        List<String> list = new ArrayList<>();

        //loop until the end of String
        while (pointer < s.length()) {
            StringBuilder word = new StringBuilder();

            //if char is not a blank, append to the word
            if (s.charAt(pointer) != ' ') {
                while (s.charAt(pointer) != ' ') {
                    word.append(s.charAt(pointer));
                    if (pointer == s.length() - 1) {
                        break;

                    }
                    pointer++;
                }
                list.add(word.toString());
            }

            pointer++;
        }


        Collections.reverse(list);

        StringBuilder sb = new StringBuilder();
       

        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}