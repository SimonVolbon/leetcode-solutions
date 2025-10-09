class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double longestDiagonal = 0;
        int largestArea = 0;

        for(int i = 0; i < dimensions.length; i++) {
            int a = dimensions[i][0];
            int b = dimensions[i][1];
            double c = Math.sqrt(a*a + b*b);
            if(c > longestDiagonal) {
                longestDiagonal = c;
                largestArea = a * b;
            } else if(c == longestDiagonal) {
                if(a * b > largestArea) {
                    largestArea = a*b;
                }
            }
        }

        return largestArea;
    }
}
