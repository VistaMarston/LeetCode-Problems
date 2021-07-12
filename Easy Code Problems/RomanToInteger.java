import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
		// Create a hashMap that contains all of the Roman numerial values;
		HashMap<Character, Integer> rnum = romanNumerials();
		int total = 0;
		for (int index = 0; index < s.length(); index++) {
			char letter = s.charAt(index);
			if (index < s.length() - 1 && (letter == 'I') && (s.charAt(index + 1) == 'V' || s.charAt(index + 1) == 'X')) {
				total += rnum.get(s.charAt(index + 1)) - rnum.get(letter);
				index++;
			} else if (index < s.length() - 1 && (letter == 'X') && (s.charAt(index + 1) == 'L' || s.charAt(index + 1) == 'C')) {
				total += rnum.get(s.charAt(index + 1)) - rnum.get(letter);
				index++;
			} else if (index < s.length() - 1 && (letter == 'C') && (s.charAt(index + 1) == 'D' || s.charAt(index + 1) == 'M')) {
				total += rnum.get(s.charAt(index + 1)) - rnum.get(letter);
				index++;
			} else
				total += rnum.get(letter);
		}
		return total;
	}

	private HashMap<Character, Integer> romanNumerials() {
		HashMap<Character, Integer> romainNumerials = new HashMap<>();
		romainNumerials.put('I', 1);
		romainNumerials.put('V', 5);
		romainNumerials.put('X', 10);
		romainNumerials.put('L', 50);
		romainNumerials.put('C', 100);
		romainNumerials.put('D', 500);
		romainNumerials.put('M', 1000);
		return romainNumerials;
	}
}
