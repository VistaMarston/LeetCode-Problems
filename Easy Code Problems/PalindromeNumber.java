class Solution {
     public boolean isPalindrome(int x) {
        // Convert int into a string
        String number = "" + x;
        int frontIndex = 0;
        int endIndex = number.length() - 1;
        while(frontIndex < endIndex) {
            if (number.charAt(frontIndex) != number.charAt(endIndex))
                return false;
            frontIndex++;
            endIndex--;
        }
        return true;
    }
}
