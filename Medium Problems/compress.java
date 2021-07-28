class Solution {
    public int compress(char[] chars) {
        int compLength = 0;
        for (int index = 0; index < chars.length; index++) {
            int[] values = findNextChar(chars, index, compLength);
            index = values[0];
            compLength = values[1];
        }
        return compLength;
    }
    
    private int[] findNextChar(char[] chars, int index, int compLength) {
        char current = chars[index];
        int count = 0;
        while (index < chars.length && current == chars[index]) {
            index++;
            count++;
        }
        chars[compLength] = current;
        compLength++;
        if (count != 1) {
            String num = "" + count;
            char[] numChar = num.toCharArray();
            for(char nums : numChar) {
                chars[compLength] = nums;
                compLength++;
            }
        }
        return new int[]{index - 1, compLength};
    }

}
