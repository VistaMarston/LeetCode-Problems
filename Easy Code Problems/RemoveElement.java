class Solution {
  public int removeElement(int[] nums, int val) {
        int frontIndex = 0;
        int length = 0;
        int endIndex = nums.length - 1;
        while(frontIndex <= endIndex) {
            if (nums[frontIndex] == val) {
                while(nums[endIndex] == val & endIndex > frontIndex)
                    endIndex--;
                if (frontIndex >= endIndex)
                	break;
                int temp = nums[frontIndex];
                nums[frontIndex] = nums[endIndex];
                nums[endIndex] = temp;
                endIndex--;
            }
            frontIndex++; 
            length++;
        }
        return length;
    }
}
