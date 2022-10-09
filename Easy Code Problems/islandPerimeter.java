class Solution {
    public int islandPerimeter(int[][] grid) {
        // Breadth-First Search and if the sides are surrounded by water at it to the permiter
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        return breadthFirstSearch(visited, grid, 0);
    }
    
    private int breadthFirstSearch(boolean[][] visited, int[][] grid, int perm) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(0);
        queue.add(0);
        
        while(!queue.isEmpty()) {
            int x = queue.remove();
            int y = queue.remove();
            
            if (!visited[x][y]) {
                visited[x][y] = true;
                perm += countPrem(grid, x, y);
                if (x - 1 >= 0) {
                    queue.add(x-1);
                    queue.add(y);
                }
                
                if(x + 1 < grid.length) {
                    queue.add(x+1);
                    queue.add(y);
                }
                
                if (y - 1 >= 0) {
                    queue.add(x);
                    queue.add(y-1);
                }
                
                if(y + 1 < grid[0].length) {
                    queue.add(x);
                    queue.add(y+1);
                }
            }
        }
        return perm;
    }
    
    private int countPrem(int[][] grid, int x, int y) {
        int perm = 0;
        
        if(grid[x][y] == 0)
            return 0;
        
        if (x - 1 < 0)
            perm += 1;
        else if (grid[x-1][y] == 0)
            perm += 1;
        
        if (x + 1 >= grid.length)
            perm += 1;
        else if (grid[x+1][y] == 0)
            perm += 1;
        
        if (y - 1 < 0)
            perm += 1;
        else if (grid[x][y-1] == 0)
            perm += 1;
        
        if (y + 1 >= grid[0].length)
            perm += 1;
        else if (grid[x][y+1] == 0)
            perm += 1;
       
        return perm;
    }
}
