class Solution {
    public int findClosest(int x, int y, int z) {
        int distanceX = Math.abs(z-x);
        int distanceY = Math.abs(z-y);
        
        if(distanceX == distanceY) return 0;

        if(distanceX < distanceY) return 1;
        else return 2;
    }
}
