class Solution {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        int value = digits[index] + 1;
        digits[index] = value % 10;
        int carryover = value/10;
        while (index > 0 && carryover != 0) {
            index--;
            value = digits[index] + carryover;
            digits[index] = (value%10);
            carryover = value/10;
        }
        if (carryover != 0) {
            digits = addValues(carryover, digits);
        }
        return digits;
    }
    
    private int[] addValues(int carryover, int[] digits) {
        int[] values = new int[digits.length + 1];
        values[0] = carryover;
        for(int index = 1; index < values.length; index++) {
            values[index] = digits[index - 1];
        }
        return values;
    }
}
