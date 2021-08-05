class Solution {
    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int front = 0;
        int end = nums.length;
        int lengthBefore = 0;
        int lengthAfter = 0;
        while (front < end) {
            lengthBefore = lengthAfter;
            lengthAfter = 0;
            while(front < end && nums[front] == 1) {
                lengthAfter++;
                front++;
            }
            front++;
            if (lengthAfter == nums.length)
                maxLength = lengthAfter - 1;
            else if (lengthBefore + lengthAfter > maxLength)
                maxLength = lengthBefore + lengthAfter;
        }
        return maxLength;
    }
}
