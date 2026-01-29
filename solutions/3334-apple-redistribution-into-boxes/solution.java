class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int appleCount = IntStream.of(apple).sum();
        int boxNumber = 0;
        int m = capacity.length;
        Arrays.sort(capacity);
        int biggestBox = capacity[m - 1];
        while(appleCount > 0) {
            boxNumber += 1;
            appleCount -= biggestBox;
            if(boxNumber <= m - 1)
            {
                biggestBox = capacity[m - boxNumber - 1];
            }
        }
        
        return boxNumber;
    }
}
