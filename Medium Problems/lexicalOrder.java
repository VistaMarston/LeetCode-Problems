import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> list = new ArrayList<>();
        for(int num = 1; num <= n; num++) {
            String number = "" + num;
            list.add(number);
        }
        
        Collections.sort(list);
        
        List<Integer> ordered = new ArrayList<>();
        for(int index = 0; index < list.size(); index++)
            ordered.add(Integer.parseInt(list.get(index)));
        
        return ordered;
    }
}
