class Solution {
    public String largestGoodInteger(String num) {
        
        int maxGood = -1;

        for (int i = 0; i < num.length() - 2; i++) {
            char[] substring = num.substring(i, i + 3).toCharArray();

            if(substring[0] == substring[1] && substring[0] == substring[2] && substring[1] == substring[2])
            {
                int value =  Integer.parseInt(new String(substring));

                if(value > maxGood) {
                    maxGood = value;
                }
            }
        }

        if (maxGood == -1) return "";

        return maxGood == 0 ? "000" : Integer.toString(maxGood);

    }
}
