class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        Map<Character, Integer> ransomCharacterCount = new HashMap<>();
        Map<Character, Integer> magazineCharacterCount = new HashMap<>();

        for(Character character : magazine.toCharArray()) {
            magazineCharacterCount.put(character, magazineCharacterCount.getOrDefault(character, 0) + 1);
        }

        for (char character : ransomNote.toCharArray()) {
            int countInMagazine = magazineCharacterCount.getOrDefault(character, 0);
            
            if (countInMagazine == 0) {
                return false;
            }

            magazineCharacterCount.put(character, countInMagazine - 1);
        }

        return true;
    }
}
