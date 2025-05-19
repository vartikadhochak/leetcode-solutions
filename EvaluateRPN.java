import java.util.*;

public class EvaluateRPN {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};

        System.out.println("Output 1: " + solution.evalRPN(tokens1)); // 9
        System.out.println("Output 2: " + solution.evalRPN(tokens2)); // 6
        System.out.println("Output 3: " + solution.evalRPN(tokens3)); // 22
    }
}

class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int b = stack.pop();
                int a = stack.pop();
                int result = applyOperation(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || 
               token.equals("*") || token.equals("/");
    }

    private int applyOperation(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // Truncates toward 0 in Java
            default: throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
}
