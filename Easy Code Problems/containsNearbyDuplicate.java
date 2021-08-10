import java.util.HashMap;
import java.util.ArrayList;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> seenNum = new HashMap<>();
        for(int index = 0; index < nums.length; index++) {
            if (seenNum.containsKey(nums[index])) {
                int preIndex = seenNum.get(nums[index]);
                if (Math.abs(index - preIndex) <= k)
                    return true;
                else 
                    seenNum.put(nums[index], index);
            }
            else
               seenNum.put(nums[index], index);                     
        }
        return false;
    }
}
