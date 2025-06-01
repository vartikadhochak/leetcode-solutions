public class SmallestPalindrome{
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.makeSmallestPalindrome("egcfe")); // Output: efcfe
        System.out.println(sol.makeSmallestPalindrome("abcd"));  // Output: abba
        System.out.println(sol.makeSmallestPalindrome("seven")); // Output: neven
    }
}

class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            if (chars[i] != chars[j]) {
                if (chars[i] < chars[j]) {
                    chars[j] = chars[i];
                } else {
                    chars[i] = chars[j];
                }
            }
            i++;
            j--;
        }

        return new String(chars);
    }
}
