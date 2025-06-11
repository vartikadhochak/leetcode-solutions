// File: ZigzagDemo.java
public class ZigzagDemo{

    // -------- solution logic -----------
    private static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();
        int r = 0, dir = 1;                  // dir = +1 down, -1 up
        for (char ch : s.toCharArray()) {
            rows[r].append(ch);
            if (r == 0) dir = 1;
            else if (r == numRows - 1) dir = -1;
            r += dir;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb : rows) ans.append(sb);
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));   // → PAHNAPLSIIGYIR
        System.out.println(convert("PAYPALISHIRING", 4));   // → PINALSIGYAHRPI
        System.out.println(convert("A", 1));                // → A
    }
}
