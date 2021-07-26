import java.util.HashMap;

class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        int duplicate = 0, missing = 0;
        
        for(int num : nums) {
            if(!numCount.containsKey(num))
                numCount.put(num, 1);
            else {
                duplicate = num;
            }
        }
        
        for(int index = 1; index <= nums.length; index++) {
            if(!numCount.containsKey(index)) {
                missing = index;
                break;
            }
                
        }
        return new int[]{duplicate, missing};
    }
}
