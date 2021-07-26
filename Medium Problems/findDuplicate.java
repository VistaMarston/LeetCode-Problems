import java.util.HashMap;
class Solution {
    public int findDuplicate(int[] nums) {
        if (nums.length <= 2)
            return nums[0];
        
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int num : nums) {
            if(!seen.containsKey(num)) {
                seen.put(num, 1);
            } else
                return num;
        }
        return nums[0];
    }
}
