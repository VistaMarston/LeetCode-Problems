class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        for(int firstIndex = 0; firstIndex < nums.size(); firstIndex++){
            if(nums[firstIndex] == 0) {
                int secondIndex = findSecondIndex(nums, firstIndex);
                if(secondIndex > 0)
                    swap(nums, firstIndex, secondIndex);
            }
        }
    }
    
    
    /**
    * Finds the next non-zero element in the list
    **/
    int findSecondIndex(const vector<int>& nums, int secondIndex){
        while(secondIndex < nums.size() && nums[secondIndex] == 0) {
            secondIndex++;
            if(secondIndex == nums.size())
                return -1;
        }
            
        return secondIndex;
    }
    
    /**
    * Swaps two values within a list given the indexes
    **/
    void swap(vector<int>& list, int firstIndex, int secondIndex){
        int temp = list[firstIndex];
        list[firstIndex] = list[secondIndex];
        list[secondIndex] = temp;
    }
};
