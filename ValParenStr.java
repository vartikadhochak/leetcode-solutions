// File: ValParenStr.java

public class ValParenStr {
    public static boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                low--;
                high--;
            } else { // '*'
                low--;
                high++;
            }

            if (high < 0) return false;
            if (low < 0) low = 0;
        }

        return low == 0;
    }

    public static void main(String[] args) {
        String s = "(*))";
        boolean result = checkValidString(s);
        System.out.println("Is the string \"" + s + "\" valid? " + result);
    }
}
