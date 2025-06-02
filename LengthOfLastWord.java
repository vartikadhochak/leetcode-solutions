public class LengthOfLastWord {
    public static class Solution {
        public int lengthOfLastWord(String s) {
            s = s.trim();
            int length = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) != ' ') {
                    length++;
                } else if (length > 0) {
                    break;
                }
            }

            return length;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.lengthOfLastWord("Hello World")); // 5
        System.out.println(sol.lengthOfLastWord("   fly me   to   the moon  ")); // 4
        System.out.println(sol.lengthOfLastWord("luffy is still joyboy")); // 6
    }
}
