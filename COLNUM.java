import java.util.Scanner;

public class COLNUM {

    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from the user
        System.out.print("Enter Excel column title (e.g., A, AB, ZY): ");
        String columnTitle = scanner.nextLine().trim().toUpperCase();

        int columnNumber = titleToNumber(columnTitle);

        System.out.println("Column number: " + columnNumber);

        scanner.close();
    }
}
