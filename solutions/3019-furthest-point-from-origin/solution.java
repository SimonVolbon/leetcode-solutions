class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int lCount = 0;
        int rCount = 0;
        int _Count = 0;

        for(char c : moves.toCharArray()) {
            switch(c) {
                case 'L': lCount++; break;
                case 'R': rCount++; break;
                case '_': _Count++; break;
            }
        }

        return Math.abs(lCount - rCount) + _Count;
    }
}
