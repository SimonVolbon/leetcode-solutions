class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[i].length; j++) {
                if(grid[i][j] < 0) {
                    sum = sum + (grid[i].length - j);
                    break;
                }
            }
        }
        return sum;
    }
}
