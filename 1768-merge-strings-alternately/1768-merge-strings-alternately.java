class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder sb1=new StringBuilder(word1);
		 StringBuilder sb2=new StringBuilder(word2);
		 StringBuilder ans=new StringBuilder();
		 
		 int l= sb1.length()<=sb2.length() ? sb1.length():sb2.length();
		 
		 for(int i=0; i<l; i++) {
			 ans.append(sb1.charAt(i)).append(sb2.charAt(i));
		 }
		 
		 if(sb1.length()!=sb2.length()) {
			 StringBuilder tmp=sb1.length()<sb2.length() ? sb2:sb1;
			 ans.append(tmp.substring(l));
		 }
		 
		 
	    return ans.toString();
    }
}