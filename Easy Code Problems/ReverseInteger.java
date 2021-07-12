class Solution {
    public int reverse(int x) {
        int newInt = 0;
        String revInt = "";
        
        if (x < 0) { // Negative Check
            revInt += "-";
            x *= -1; // Make Positive
        }
        
        while(x > 0) { // Grab the last digit
            int end = x % 10;
            revInt += "" + end;
            x /= 10;
        }
        
        try { // Ensure that reverse is within int value.
            newInt = java.lang.Integer.parseInt(revInt);
        } catch (Exception e) {
            return newInt;
        }
        
        return newInt;
    }
}
