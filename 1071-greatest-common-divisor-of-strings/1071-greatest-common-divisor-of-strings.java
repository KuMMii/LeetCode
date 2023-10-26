class Solution {
     public static String gcdOfStrings(String str1, String str2) {
	    	if(!(str1+str2).equals(str2+str1)) return "";
	    	
    		int i=GCD(str1.length(),str2.length());
    		return str1.substring(0,i);
	    	
	    	
	    }

		public static int GCD(int s1, int s2) {
			if(s2==0) return s1;
            else return GCD(s2,s1%s2);
		}
}