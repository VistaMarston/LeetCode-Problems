public class Solution {
    public string LargestOddNumber(string num) {
        for(int index = num.Length - 1; index >= 0; index--) {
            int digit = num[index] - '0';
            if(digit%2 != 0)
                return num.Substring(0, index + 1);
        }
        return "";
    }
}
