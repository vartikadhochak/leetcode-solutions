class Solution {
    public boolean isValid(String s) {
        // Create a stack to store the opening brackets
        Stack<Character> stack = new Stack<>();
        
        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If the character is a closing bracket
            else {
                // If the stack is empty or the top of the stack doesn't match the current closing bracket
                if (stack.isEmpty()) return false;
                
                char top = stack.pop();
                
                // Check if the current closing bracket matches the last opened bracket
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        
        // If the stack is empty, all brackets were correctly closed
        return stack.isEmpty();
    }
}
