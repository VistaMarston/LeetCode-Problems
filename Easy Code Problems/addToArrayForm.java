import java.util.Arrays;
import java.util.List;
import java.math.BigInteger;
import java.lang.*;
import java.io.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        String numString = "";
        for(int integer : num)
        	numString += integer;
        
        BigInteger number = new BigInteger(numString);
        BigInteger sum = number.add(new BigInteger("" + k));
        String total = sum.toString();
        for(int index = 0; index < total.length(); index++)
            result.add(Integer.parseInt("" + total.charAt(index)));
        return result;
    }
}
