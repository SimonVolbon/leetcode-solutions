class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        boolean containsLetter = false;
        int count = 0;
        for(String word : words) {

            for(char c : brokenLetters.toCharArray()){
                if(word.indexOf(c) != -1) {
                    containsLetter = true;
                    break;
                }
            }

            if(!containsLetter) count++;

            containsLetter = false;
        }

        return count;
    }
}
