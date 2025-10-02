class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drunkBottles = numBottles;
        int emptyBottles = drunkBottles;

        while(true) {
            int fullBottles = 0;

            while(emptyBottles >= numExchange) {
                emptyBottles -= numExchange;
                fullBottles++;
                numExchange++;
            }

            drunkBottles += fullBottles;
            emptyBottles += fullBottles;

            if(emptyBottles < numExchange) return drunkBottles;
        }
    }
}
