class Solution {
    public String longestCommonPrefix(String[] strs) {
        String comPref = strs[0];
        int index = 1;
        
        while (index < strs.length) {
            comPref = findCommonPrefix(comPref, strs[index]);
            index++;
        }
        return comPref;
    }
    
    private String findCommonPrefix(String word1, String word2) {
        if(word1.length() == 0)
            return "";
        
        String comPref = "";
        int count = 0;
        
        if (word1.length() > word2.length())
            count = word2.length();
        else 
            count = word1.length();
        
        for (int i = 0; i < count; i++) {
            if (word1.charAt(i) == word2.charAt(i))
                comPref += word1.charAt(i);
            else
                break;
        }
        return comPref;
    }
}
