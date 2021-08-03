import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = findBinaryNumber(a);
        BigInteger num2 = findBinaryNumber(b);
      
        return convertToBinary(num1.add(num2));
    }
    
    private BigInteger findBinaryNumber(String binary) {
        BigInteger num = new BigInteger("0");
        BigInteger base = new BigInteger("2");
        for(int index = binary.length(); index > 0; index--){
        	int powerInt =  binary.length() - index;
            BigInteger bin = new BigInteger("" + binary.charAt(index - 1));
            BigInteger result = base.pow(powerInt);
            bin = bin.multiply(result);
            num = num.add(bin);
        }
        return num;
    }
    
    private String convertToBinary(BigInteger num) {
        String binary = "";
        while(num.compareTo(new BigInteger("0")) != 0) {
            BigInteger[] value = num.divideAndRemainder(new BigInteger("2"));
            num = value[0];
            binary = value[1].toString() + binary;
        }
        return (binary.length() == 0)? "0" : binary;
    }
    
}
