public class MinRem {
    public static void main(String[] args) {
        String input = "lee(t(c)o)de)";
        System.out.println("Valid String: " + minRemoveToMakeValid(input));
    }

    public static String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;

        // First pass
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
                sb.append(c);
            } else if (c == ')') {
                if (open > 0) {
                    open--;
                    sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }

        // Second pass
        StringBuilder res = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            char c = sb.charAt(i);
            if (c == '(' && open-- > 0) continue;
            res.append(c);
        }

        return res.reverse().toString();
    }
}
