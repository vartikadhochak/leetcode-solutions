public class BreakPalindrome{
    public String breakPalindrome(String palindrome) {
        int n = palindrome.length();
        if (n == 1) return "";
        
        char[] p = palindrome.toCharArray();
        
        for (int i = 0; i < n / 2; i++) {
            if (p[i] != 'a') {
                p[i] = 'a';
                return new String(p);
            }
        }
        
        p[n - 1] = 'b';
        return new String(p);
    }

    public static void main(String[] args) {
        BreakPalindrome bp = new BreakPalindrome();
        
        // Test cases
        String[] testCases = {
            "a",       // Output: ""
            "aa",     // Output: "ab"
            "aba",    // Output: "abb"
            "abba",  // Output: "aaba"
            "bb",     // Output: "ab"
            "aaa",    // Output: "aab"
            "aaaa",   // Output: "aaab"
            "abccba" // Output: "aaccba"
        };

        for (String testCase : testCases) {
            System.out.println("Input: \"" + testCase + "\"");
            System.out.println("Output: \"" + bp.breakPalindrome(testCase) + "\"");
            System.out.println();
        }
    }
}