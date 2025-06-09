// File: LongestCommonPrefixDemo.java
import java.util.*;

public class LongestCommonPrefixDemo{
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"interspecies", "interstellar", "interstate"},
            {"a"},
            {""},
            {"abc", "abc", "abc"},
            {"abc", "abcd", "ab"},
        };

        for (String[] test : testCases) {
            System.out.println("Input: " + Arrays.toString(test));
            System.out.println("Longest Common Prefix: \"" + longestCommonPrefix(test) + "\"");
            System.out.println();
        }
    }
}
