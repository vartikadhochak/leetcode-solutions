public class NthDigit {

    public static int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        long start = 1;

        // Step 1: find the digit length
        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        // Step 2: find the actual number
        start += (n - 1) / digitLength;

        // Step 3: find the digit within the number
        String numberStr = Long.toString(start);
        return numberStr.charAt((n - 1) % digitLength) - '0';
    }

    public static void main(String[] args) {
        // Example 1: n = 3
        int n1 = 3;
        int result1 = findNthDigit(n1);
        System.out.println("The " + n1 + "rd digit is: " + result1); // Output: 3

        // Example 2: n = 11
        int n2 = 11;
        int result2 = findNthDigit(n2);
        System.out.println("The " + n2 + "th digit is: " + result2); // Output: 0

        // Example 3: n = 15
        int n3 = 15;
        int result3 = findNthDigit(n3);
        System.out.println("The " + n3 + "th digit is: " + result3);
    }
}
