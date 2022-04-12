class Solution {
    public int[] replaceElements(int[] arr) {
        // Capture the last item, replace with -1
        int lastItem = arr[arr.length-1];
        arr[arr.length-1] = -1;
        
        // For the remaining Items - replace values with largest
        for(int i = arr.length-2; i >= 0; i--) {
            if(arr[i] < lastItem){
                arr[i] = lastItem;
            } else {
                int temp = arr[i];
                arr[i] = lastItem;
                lastItem = temp;
            }
        }
        return arr;
    }
}
