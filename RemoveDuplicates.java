// File: RemoveDuplicates.java
import java.util.*;

public class RemoveDuplicates{
    // ---- core logic ----
    public static String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            int n = sb.length();
            if (n > 0 && sb.charAt(n - 1) == ch) {
                sb.deleteCharAt(n - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    // ---- demo driver ----
    public static void main(String[] args) {
        List<String> tests = Arrays.asList("abbaca", "azxxzy");
        for (String s : tests) {
            System.out.printf("Input: %s  →  Output: %s%n",
                              s, removeDuplicates(s));
        }
    }
}
