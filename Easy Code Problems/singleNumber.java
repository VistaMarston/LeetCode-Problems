class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        
        Arrays.sort(nums);
        
        for(int index = 1; index < nums.length; index = index + 2) {
            if (nums[index - 1] != nums[index])
                return nums[index - 1];
        }
        return nums[nums.length - 1];
        
    }
}
