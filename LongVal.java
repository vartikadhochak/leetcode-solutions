import java.util.Stack;

public class LongVal {
    public int longestValidParentheses(String s) {
        int maxLength = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base for calculating the length of valid parentheses

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    maxLength = Math.max(maxLength, i - stack.peek());
                }
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongVal lv = new LongVal();
        String input = "(()))())("; // sample input
        System.out.println("Longest Valid Parentheses Length: " + lv.longestValidParentheses(input));
    }
}
