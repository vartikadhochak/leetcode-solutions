// FirstPalindrome.java

public class FirstPalindrome{
    private static boolean isPal(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++; j--;
        }
        return i >= j;
    }

    public static String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPal(w)) return w;
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words1 = {"abc","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words1));   // ada

        String[] words2 = {"def","ghi"};
        System.out.println(firstPalindrome(words2));   // (empty)
    }
}
