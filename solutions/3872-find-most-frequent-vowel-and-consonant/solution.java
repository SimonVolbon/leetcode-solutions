class Solution {
    public int maxFreqSum(String s) {
        Map<Character, Integer> vowelCount = new HashMap<>();
        Map<Character, Integer> constantCount = new HashMap<>();
        for(Character c : s.toCharArray()) {
            if("aeiou".indexOf(c) < 0) {
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            } else {
                constantCount.put(c, constantCount.getOrDefault(c, 0) + 1);
            }
        }

        int maxVowle = vowelCount.values().size() != 0 ? Collections.max(vowelCount.values()) : 0;
        int maxConstant = constantCount.values().size() != 0 ? Collections.max(constantCount.values()) : 0;

        return maxVowle + maxConstant;
    }
}
