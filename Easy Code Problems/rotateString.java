class Solution {
    /*
        Deteriming if taking a string can be made by 
        taking the left most position and moving it to 
        the right most position can make the goal string
    */
    public boolean rotateString(String s, String goal) {
        int length = s.length();
        int counter = length;
      
        while(counter-- > 0) {
            if(s.equals(goal))
                return true;

            if(length > 1)
                s = s.substring(1, length) + s.charAt(0); 
        }

        return false;
    }
}
