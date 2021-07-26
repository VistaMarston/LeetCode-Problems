class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        
        if (nums.length <= 3)
            return nums[0];
        
        for(int index = 2; index < nums.length; index = index + 3) {
            if (nums[index] != nums[index - 1]) {
                return nums[index - 1];
            } else if (nums[index] != nums[index - 2]) {
                return nums[index - 2];
            }
        }
        
        return nums[nums.length - 1];
    }
}
