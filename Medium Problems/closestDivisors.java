class Solution {
    public int[] closestDivisors(int num) {
        List<int[]> divisors = findDivisors(num + 1, num + 2);
        return findMinDis(divisors);
    }
    
    private int[] findMinDis(List<int[]> divisors) {
        int minDis = Integer.MAX_VALUE;
        int[] minPair = new int[2];
        for(int index = 0; index < divisors.size(); index++) {
            int[] pairs = divisors.get(index);
            int dis = Math.abs(pairs[1] - pairs[0]);
            if(dis < minDis) {
                minDis = dis;
                minPair = pairs;
            }
        }
        return minPair;
    }
    
    private List<int[]> findDivisors(int num1, int num2) {
        List<int[]> divisors = new ArrayList<>();
        for(int index = 1; index <= Math.sqrt(num1); index++) {
            if (num1%index == 0) {
                int pair = num1/index;
                divisors.add(new int[] {index, pair});
            }
        }
        
        for(int index = 1; index <= Math.sqrt(num2); index++) {
            if (num2%index == 0) {
                int pair = num2/index;
                divisors.add(new int[] {index, pair});
            }
        }
        return divisors;
    }
}
