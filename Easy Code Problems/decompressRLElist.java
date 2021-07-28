import java.util.ArrayList;
class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> decomp = new ArrayList<>();
        for(int index = 0; index < nums.length; index += 2) {
            int freq = nums[index];
            int value = nums[index + 1];
            for(int count = 0; count < freq; count++) {
                decomp.add(value);
            }
        }
        
        int[] decompressed = new int[decomp.size()];
        for(int index = 0; index < decomp.size(); index++)
            decompressed[index] = decomp.get(index);
        return decompressed;
    }
}
