//MaxVowelsInSubstring
import java.util.*;

public class MaxVowelsInSubstring{
    public static int maxVowels(String s, int k) {
        int max = 0, count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');

        for (int i = 0; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i))) count++;
            if (i >= k && vowels.contains(s.charAt(i - k))) count--;
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3)); // Output: 3
        System.out.println(maxVowels("aeiou", 2));     // Output: 2
        System.out.println(maxVowels("leetcode", 3));  // Output: 2
    }
}
