class Solution {
public:
    int search(vector<int>& nums, int target) {
        int high = nums.size()-1;
        int low = 0;
        while(low <= high) {
            int mid = (high+low)/2;
            int curItem = nums[mid];
            if(curItem == target)
                return mid;
            else if(curItem < target) 
                low = mid + 1;
            else
                high = mid -1;
        }
        return -1;
    }
};
