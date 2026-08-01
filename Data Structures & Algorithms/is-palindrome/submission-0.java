class Solution {
    public boolean isPalindrome(String s) {
        String string = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;

        for (int right = string.length() - 1; right >= 0; right--) {
            if (string.charAt(left) != string.charAt(right)) {
                return false;
            }
            left++;
        }
        return true;
    }
}
