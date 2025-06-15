public class NumSubString{
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; // Tracks counts of 'a', 'b', 'c'
        int res = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            count[c - 'a']++;
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += s.length() - right;
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NumSubString solution = new NumSubString();
        System.out.println(solution.numberOfSubstrings("abcabc")); // Output: 10
        System.out.println(solution.numberOfSubstrings("aaacb"));  // Output: 3
        System.out.println(solution.numberOfSubstrings("abc"));    // Output: 1
    }
}