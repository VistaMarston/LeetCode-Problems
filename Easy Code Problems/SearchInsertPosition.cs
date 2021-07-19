public class Solution {
    public int SearchInsert(int[] nums, int target) {
        int lowIndex = 0;
        int highIndex = nums.Length - 1;
        while (lowIndex <= highIndex) {
            int middle = (highIndex + lowIndex)/2;
            int num = nums[middle];
            if (num == target)
                return middle;
            else if (num > target)
                highIndex = middle - 1;
            else
                lowIndex = middle + 1;
        }
        return lowIndex;
    }
}
