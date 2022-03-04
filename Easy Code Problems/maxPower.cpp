class Solution {
public:
    int maxPower(string s) {
        int max = 0;
        char prevLetter = s[0];
        int count = 0;
        for(auto letter : s){
            if(letter == prevLetter)
                count++;
            else {
                if(max < count)
                    max = count;
                count = 1;
                prevLetter = letter;
            }
        }
        if(count > max)
            return count;
        
        return max;
    }
};
