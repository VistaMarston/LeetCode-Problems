public class Solution {
    public int FindSpecialInteger(int[] arr) {
        for(int index = 1; index < arr.Length; index++) {
            double count = 1;
            while(index < arr.Length && (arr[index - 1] == arr[index])) {
                count++;
                index++;
            }
            double percentage = (count/arr.Length);
            if(percentage > .25) 
                return arr[index - 1];
        }
        return arr[0];
    }
}
