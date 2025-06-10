// File: ReverseWords.java
public class ReverseWords{
    public static void main(String[] args) {
        String input = "  hello   world  ";
        System.out.println("Reversed: \"" + reverseWords(input) + "\"");
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}
