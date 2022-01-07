public class Solution {
    public int HammingWeight(uint n) {
        int total_count = 0;
        string number = Convert.ToString(n, 2).ToString();
        foreach(char letter in number)
            if(letter == '1')
                total_count++;
        
        return total_count;
    }
}
