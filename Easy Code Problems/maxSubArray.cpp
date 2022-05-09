class Solution {
public:
    /**
    * maxSubArray - Finds the maximum contigous subarray and 
    * returns the maximum total.
    */
    int maxSubArray(vector<int>& nums) {
        int maxSolution = nums.at(0);
        int table = 0;
        
        for(int item : nums) {
            int partialSolution = max(table + item, item);
            if(partialSolution > maxSolution)
                maxSolution = partialSolution;
            table = partialSolution;
        }
      
        return maxSolution;
    }
};
