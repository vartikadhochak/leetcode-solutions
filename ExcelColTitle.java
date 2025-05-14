// ExcelColTitle.java

public class ExcelColTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Adjust to 0-based index
            int rem = columnNumber % 26;
            sb.append((char) ('A' + rem));
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        int col1 = 1;
        int col2 = 28;
        int col3 = 701;

        System.out.println(convertToTitle(col1)); // A
        System.out.println(convertToTitle(col2)); // AB
        System.out.println(convertToTitle(col3)); // ZY
    }
}
