class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length() < b.length())
            return b.length();
        if(a.length() > b.length())
            return a.length();
        for(int index = 0; index < a.length(); index++){
            if(a.charAt(index) != b.charAt(index))
                return a.length();
        }
        return -1;
    }
}
