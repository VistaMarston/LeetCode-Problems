import java.util.HashMap;
class Solution {
     public int lengthOfLongestSubstring(String s) {
		int maxLength = 0;
		int length = 0;
		HashMap<Character, Integer> uniqueChar = new HashMap<>();
		for (int index = 0; index < s.length(); index++) {
			if (!uniqueChar.containsKey(s.charAt(index))) {
				uniqueChar.put(s.charAt(index), 1);
				length++;
			} else {
				if (length > maxLength)
					maxLength = length;
                if (!(s.charAt(index) == (s.charAt(index - 1))))
				    length = nonRepeatChar(s, index, uniqueChar);
                else {
                    length = 1;
                    uniqueChar.clear();
                    uniqueChar.put(s.charAt(index), 1);
                }
                
			}
		}
		return (length > maxLength) ? length : maxLength;
	}

	private int nonRepeatChar(String s, int index, HashMap<Character, Integer> uniqueChar) {
		uniqueChar.clear();
		int length = 0;
		while (index > 0 && !uniqueChar.containsKey(s.charAt(index))) {
			uniqueChar.put(s.charAt(index), 1);
			index--;
			length++;
		}
		return length;
	}
}
