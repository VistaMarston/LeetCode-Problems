
public class Solution {
    public string CountAndSay(int n) {
        if (n == 1)
            return "1";
        return CountAndSayRec(n);
    }
    
    private string CountAndSayRec(int n) {
        if (n == 2)
            return "11";
        
        string value = CountAndSayRec(n - 1); 
        return condenseString(value);
    }
    
    private string condenseString(string value) {
        string say = "";
        for(int index = 0; index < value.Length; index++) {
            char preLetter = value[index];
            int count = 0;
            while(index < value.Length && preLetter == value[index]) {
                index++;
                count++;
            }
            index--;
            say += count.ToString() + preLetter;
        }
        return say;
    }
}
