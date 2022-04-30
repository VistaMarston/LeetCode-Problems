class Solution {
    /**
    * Tries to find the minimum number of moves that are needed 
    * to get all the elements the same number.
    */
    public int minMoves2(int[] nums) {
        insertionSort(nums);
        int moves = 0;
        for(int index = 0; index < nums.length/2; index++){
            moves += nums[nums.length - index - 1] - nums[index];
        }
        return moves;
    }
    
    /**
    * Runs insertion Sort to sort the array of integers
    */
    private void insertionSort(int[] nums){
        for(int unsortedIndex = 1; unsortedIndex < nums.length; unsortedIndex++){
            int sortedIndex = unsortedIndex - 1;
            int key = nums[unsortedIndex];
            while(sortedIndex >= 0 && nums[sortedIndex] > key){
                nums[sortedIndex + 1] = nums[sortedIndex];
                sortedIndex--;
            }
            nums[sortedIndex+1] = key;
        }
    }
}
