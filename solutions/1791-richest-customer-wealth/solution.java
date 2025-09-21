class Solution {
    public int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for(int[] account : accounts){
            int overallBalance = 0;
            for(int balance : account) {
                overallBalance += balance;
            }

            if(overallBalance >= maxWealth)
            {
                maxWealth = overallBalance;
            }
        }

        return maxWealth;
    }
}
