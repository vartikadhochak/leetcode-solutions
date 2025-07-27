class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // skip anything that is not a letter or digit
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            // compare the current pair in lower-case form
            if (Character.toLowerCase(s.charAt(left))
                != Character.toLowerCase(s.charAt(right))) {
                return false;                 // first mismatch ⇒ not a palindrome
            }
            left++;
            right--;
        }
        return true;                          // finished the scan with no mismatches
    }
}
