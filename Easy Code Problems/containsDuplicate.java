import java.util.HashMap;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> uniqueNum = new HashMap<>();
        for(int num : nums) {
            if(uniqueNum.containsKey(num))
                return true;
            else 
                uniqueNum.put(num, 1);
        }
        return false;
    }
}
