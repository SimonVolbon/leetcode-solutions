class Solution {
    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public int romanToInt(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            int currValue = getValue(s.charAt(i));

            if (i + 1 < s.length() && currValue < getValue(s.charAt(i + 1))) {
                number -= currValue;
            } else {
                number += currValue;
            }
        }
        return number;
    }
}
