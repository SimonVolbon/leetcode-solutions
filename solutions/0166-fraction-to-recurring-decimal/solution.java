import java.util.HashMap;
import java.util.Map;

class Solution {
    public String fractionToDecimal(int numeratorInt, int denominatorInt) {

        if (numeratorInt == 0) return "0";


        StringBuilder result = new StringBuilder();
        
        if ((numeratorInt < 0) ^ (denominatorInt < 0)) {
            result.append("-");
        }

        long numerator = Math.abs((long) numeratorInt);
        long denominator = Math.abs((long) denominatorInt);

        result.append(numerator / denominator);
        long remainder = numerator % denominator;
        System.out.println(remainder);
        if (remainder == 0) {
            return result.toString();
        }

        result.append(".");

        Map<Long, Integer> remainderMap = new HashMap<>();
        
        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                int startIndex = remainderMap.get(remainder);
                result.insert(startIndex, "(");
                result.append(")");
                break;
            }

            remainderMap.put(remainder, result.length());

            remainder *= 10;
            System.out.println(remainder);
            result.append(remainder / denominator);
            remainder %= denominator;
        }

        return result.toString();
    }
}
