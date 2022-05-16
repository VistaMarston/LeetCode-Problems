class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        vector<int> remainer {0,0,0};
        for (auto bill : bills){
            cout << remainer[0] << remainer[1] << remainer[2] << endl;
            switch(bill) {
                case 5: {
                    remainer[0]++;
                    break;
                }
                case 10: {
                    remainer[0]--;
                    remainer[1]++;
                    if(remainer[0] < 0)
                        return false;
                    break;
                }
                case 20: {
                    if(remainer[0] >=1 && remainer[1] >= 1) {
                        remainer[0]--;
                        remainer[1]--;
                        remainer[2]++;
                        continue;
                    }
                    if(remainer[0] >= 3){
                        remainer[0] -= 3;
                        remainer[2]++;
                        continue;
                    }
                    return false;
                }
            }
        }  
        return true;
    }
};
