class Solution {
    public boolean isPalindrome(int x) {
        String word = String.valueOf(x);
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
