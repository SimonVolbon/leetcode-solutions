class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            if(i == n / 2) {
                if(n % 2 == 0) {
                    ans[i] = -(n - i);
                    ans[n-i-1] = (n - i);
                } else{
                    ans[i] = 0;
                }

                return ans;
            } else {
                ans[i] = -(n - i);
                ans[n-i-1] = (n - i);
            }
        }

        return null;
    }
}
