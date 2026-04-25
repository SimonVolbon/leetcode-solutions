class Solution {
    public int mirrorDistance(int n) {
        Integer nWrapper = new Integer(n);
        String reversedN = new StringBuilder(nWrapper.toString()).reverse().toString();
        return Math.abs(n - Integer.parseInt(reversedN));
    }
}
