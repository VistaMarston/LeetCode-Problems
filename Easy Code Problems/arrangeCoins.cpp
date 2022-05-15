class Solution {
public:
    
    /**
    * arrangeCoins - This is asking how many rows
    * will be filled if arranging the coins into 
    * the form of a stair case.
    */
    int arrangeCoins(int n) {
        int num_stair = 1;
        while((n - num_stair) >= 0){
            n -= num_stair;
            num_stair++;
        }
  
        return --num_stair;
    }
};
