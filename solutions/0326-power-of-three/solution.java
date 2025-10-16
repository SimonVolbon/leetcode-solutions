class Solution {
    public boolean isPowerOfThree(int n) {
        
        int i = 0;
        long powerNumber = 0;
        do {
            powerNumber = (long) Math.pow(3, i);
            if(powerNumber == n ) return true;
            i++;
        } while(powerNumber <= n);

        return false;
    }
}
