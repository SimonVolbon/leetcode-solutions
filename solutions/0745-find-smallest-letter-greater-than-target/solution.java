class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length - 1;
        if(Integer.valueOf(letters[n]) < Integer.valueOf(target)) return letters[0];

        for (int i = 0; i <= n; i++) {
            if(Integer.valueOf(letters[i]) > Integer.valueOf(target)) {
                return letters[i];
            }
        }

        return letters[0];
    }
}
