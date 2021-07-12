class Solution {
public int maxArea(int[] height) {
        int waterLevel = Math.min(height[0], height[height.length - 1]);
        return percolateUp(0, height.length - 1, waterLevel, (height.length - 1)*waterLevel, height);
    }
    
    private int percolateUp(int index1, int index2, int waterLevel, int area, int[] height) {
        if (index1 >= index2)
            return area;

        waterLevel++; 
        
        while(height[index1] < waterLevel && index1 < index2) { // front index > waterLevel
            index1++;
        }
        while(height[index2] < waterLevel && index1 < index2) { // End Index > waterLevel
            index2--;
        }
        
        waterLevel = Math.min(height[index1], height[index2]);  
        if (area < (index2 - index1)*waterLevel) // Calculate new water level
            area = (index2 - index1)*waterLevel;
            
        int newArea = percolateUp(index1, index2, waterLevel, area, height);
        return (area < newArea)? newArea : area;
    }
}
