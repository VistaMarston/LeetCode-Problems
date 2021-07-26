class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2) {
            return nums;
        }
        
        int[] singleNums = new int[2];
        int added = 0;
        Arrays.sort(nums);
        for(int index = 1; index < nums.length; index = index + 2) {
            if (nums[index - 1] != nums[index]) {
                singleNums[added] = nums[index - 1];
                added++;
                if(index + 1 < nums.length && nums[index] != nums[index + 1]) {
                    singleNums[added] = nums[index];
                    added++;
                } else
                    index++;
            }
            if (added == 2)
                return singleNums;
        }
        
        singleNums[added] = nums[nums.length - 1];
        return singleNums;
        
    }
}
