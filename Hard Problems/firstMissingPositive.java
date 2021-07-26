class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        
        int index = 0;
        while (index < nums.length && nums[index] <= 0)
            index++;
        
        if (index >= nums.length || nums[index] != 1)
            return 1;
        
        index++;
        int previousNum = 1;
        while(index < nums.length && (previousNum == nums[index] - 1 || previousNum == nums[index])) {
            previousNum = nums[index];
            index++;
        }
        return previousNum + 1;
        
    }
}
