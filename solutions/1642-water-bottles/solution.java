class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinkAmount = numBottles;
        int emptyBottles = numBottles;
        while(true){
            numBottles = emptyBottles / numExchange;
            emptyBottles -= numBottles * numExchange;
            if(numBottles == 0) {
                return drinkAmount;
            }
            drinkAmount += numBottles;
            emptyBottles += numBottles;
        }
    }
}
