public class gcdstrings{
    public static void main(String[] args) {
        Solution solution = new Solution();

        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("GCD of Strings: " + solution.gcdOfStrings(str1, str2)); // Output: "ABC"

        str1 = "ABABAB";
        str2 = "ABAB";
        System.out.println("GCD of Strings: " + solution.gcdOfStrings(str1, str2)); // Output: "AB"

        str1 = "LEET";
        str2 = "CODE";
        System.out.println("GCD of Strings: " + solution.gcdOfStrings(str1, str2)); // Output: ""
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if they can form a valid repeated pattern
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Get the GCD of the lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Return the common prefix of that length
        return str1.substring(0, gcdLength);
    }

    // Helper method to compute GCD
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}