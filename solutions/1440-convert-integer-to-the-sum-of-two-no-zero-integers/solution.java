class Solution {
    public int[] getNoZeroIntegers(int n) {

        for(int i = 1; i <= n; i++) {
            String a = Integer.toString(i);
            String b = Integer.toString(n - i);

            if((a.indexOf("0") + b.indexOf("0")) == -2) {
                int[] ans = {i, n - i};
                return ans;
            }

        }
        return null;
    }

}
