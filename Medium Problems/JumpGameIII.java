class Solution {
public boolean canReach(int[] arr, int start) {
		boolean[] seen = new boolean[arr.length]; // Keep track of which positions have been seen
		for (int index = 0; index < arr.length; index++)
			seen[index] = false; 
		return recursiveJump(arr, seen, start);
	}


	private boolean recursiveJump(int[] arr, boolean[] seen, int index) {
		boolean answerL = false;
		boolean answerR = false;
		if (index < 0 || index > arr.length - 1)
			return false;

		if (arr[index] == 0)
			return true;

		if (seen[index] == false) {
			seen[index] = true;
			answerL = recursiveJump(arr,seen, index - arr[index]); // Move to the left
			answerR = recursiveJump(arr, seen, index + arr[index]); // Move to the Right
		}
		return (answerL || answerR);
	}
}
