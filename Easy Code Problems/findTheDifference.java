class Solution {
    public char findTheDifference(String s, String t) {
        if (s.length() == 1)
            return t.charAt(0);
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        for(int index = 0; index < sarr.length; index++) {
            if(sarr[index] != tarr[index])
                return tarr[index];
        }
        return tarr[tarr.length - 1];
    }
}
