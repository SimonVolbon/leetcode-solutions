class Solution {
    public int maxDistance(int[] colors) {
        int length = colors.length;
        int greatestDistance = -1;
        for(int i = 0; i < length; i++){
            for(int j = length -1; j > i; j--){
                if(colors[i] != colors[j]) {
                    if((j-i) > greatestDistance )
                    {
                        greatestDistance = j - i;
                    }
                }
            }
        }

        return greatestDistance;
    }
}
