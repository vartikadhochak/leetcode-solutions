import java.util.Stack;

public class BasCal {
    public static int calculate(String s) {
        int result = 0, number = 0, sign = 1;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                number = number * 10 + (ch - '0');
            } else if (ch == '+') {
                result += sign * number;
                sign = 1;
                number = 0;
            } else if (ch == '-') {
                result += sign * number;
                sign = -1;
                number = 0;
            } else if (ch == '(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if (ch == ')') {
                result += sign * number;
                result *= stack.pop();
                result += stack.pop();
                number = 0;
            }
        }
        return result + sign * number;
    }

    public static void main(String[] args) {
        String expression = "(1+(4+5+2)-3)+(6+8)";
        System.out.println("Result: " + calculate(expression)); // Output: 23
    }
}
