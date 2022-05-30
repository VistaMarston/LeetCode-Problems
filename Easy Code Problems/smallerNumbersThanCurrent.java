class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // Create a frequency table.
        int[] freqeuncy = new int[101];
        for(int num : nums){
            freqeuncy[num]++;
        }
        
        // Figure out the Minimum Count
        int[] minimum = new int[101];
        for(int index = 1; index < freqeuncy.length; index++) {
            minimum[index] = freqeuncy[index-1] + minimum[index-1];
        }
        
        // Creation of solution 
        int[] solution = new int[nums.length];
        for(int index = 0; index < nums.length; index++) {
            solution[index] = minimum[nums[index]];
        }
        
        return solution;
    }
}
