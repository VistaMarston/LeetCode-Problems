import java.util.ArrayList;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int endIndex = nums.length - 1; // Back of the list
        int frontIndex = 0; // Front of the list
        
        while(frontIndex < endIndex) { // Looping through each item
            int cursor = frontIndex + 1;
            while(cursor <= endIndex) { // Find Variations
                if (nums[cursor] + nums[frontIndex] == target) // Addition == target
                    return new int[] {frontIndex, cursor};
                else// Addition < target
                    cursor++;              
            }
            frontIndex++;
        }
        return new int[] {frontIndex};
    }
}
