class Solution {
    public boolean isPowerOfFour(int n) {
        if(n%2 != 0 && n != 1) return false;

        int x = 0;
        int pow = 1;
        while(!(pow > n)){
            pow = (int) Math.pow( 4, x);
            if(pow == n) return true;
            x++;
        }

        return false;
    }
}
