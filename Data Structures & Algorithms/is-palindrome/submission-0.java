class Solution {
    public boolean isPalindrome(String s) {
        return s.replaceAll("[^\\p{L}\\p{N}]", "").equalsIgnoreCase(new StringBuilder(s).reverse().toString().replaceAll("[^\\p{L}\\p{N}]", ""));
    }
}
