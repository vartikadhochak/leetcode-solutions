import java.util.Stack;

public class ValidParen {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParen vp = new ValidParen();

        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "([)]";

        System.out.println(test1 + " is valid? " + vp.isValid(test1)); // true
        System.out.println(test2 + " is valid? " + vp.isValid(test2)); // false
        System.out.println(test3 + " is valid? " + vp.isValid(test3)); // false
    }
}
