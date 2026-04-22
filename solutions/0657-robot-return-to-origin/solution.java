class Solution {
    public boolean judgeCircle(String moves) {
        int totalX = 0;
        int totalY = 0;
        for(char c : moves.toCharArray()) {
            switch(c) {
                case 'U': totalY += 1; 
                    break;
                case 'D': totalY -= 1; 
                    break;
                case 'L': totalX -= 1;
                    break;
                case 'R': totalX += 1;
                    break;
            }
        }

        return (totalX == 0) && (totalY == 0);
    }
}
