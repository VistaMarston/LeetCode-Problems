class Solution {
public:
    /**
    * climbStairs - detemines how many ways
    * can someone climb n stairs if they are 
    * to take one step or two steps.
    */
    int climbStairs(int n) {
        vector<int> table {0, 1};
        for(int step = 1; step <= n; step++){
            int nextStep = table[0] + table[1];
            table[0] = table[1];
            table[1] = nextStep;
        }
        
        return table.back();
    }
};
