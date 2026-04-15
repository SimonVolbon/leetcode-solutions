class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minDiff = 101;
        for(int i = 0; i < n; i++){
            if(words[i].equals(target)) {
                int diff = Math.min(Math.abs(i - startIndex) , Math.min(startIndex + Math.abs(i - n), i + Math.abs(startIndex - n)));
                System.out.println(diff);
                if(diff < minDiff) {
                    minDiff = diff;
                }
            }
        } 

        if(minDiff == 101) {
            return -1;
        }

        return minDiff;
    }
}
