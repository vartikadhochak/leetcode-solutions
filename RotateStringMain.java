// File: RotateStringMain.java
public class RotateStringMain{
    static class Solution {
        public boolean rotateString(String s, String goal) {
            return s.length() == goal.length() && (s + s).contains(goal);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.rotateString("abcde","cdeab")); // true
        System.out.println(sol.rotateString("abcde","abced")); // false
    }
}
