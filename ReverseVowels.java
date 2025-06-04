// File: ReverseVowels.java
public class ReverseVowels {
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;

        char[] chars = s.toCharArray();
        int left = 0, right = s.length() - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {
            while (left < right && vowels.indexOf(chars[left]) == -1) left++;
            while (left < right && vowels.indexOf(chars[right]) == -1) right--;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s1 = "IceCreAm";
        String s2 = "leetcode";

        System.out.println(reverseVowels(s1)); // Output: "AceCreIm"
        System.out.println(reverseVowels(s2)); // Output: "leotcede"
    }
}
