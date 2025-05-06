// PALINDROMENUM.java

public class PALINDROMENUM {

    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) can't be palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        while (x > reversedHalf) {
            int digit = x % 10;
            reversedHalf = reversedHalf * 10 + digit;
            x /= 10;
        }

        // For even length: x == reversedHalf
        // For odd length: x == reversedHalf / 10 (middle digit can be ignored)
        return x == reversedHalf || x == reversedHalf / 10;
    }

    public static void main(String[] args) {
        PALINDROMENUM solution = new PALINDROMENUM();

        int num = 121;  // Example input

        System.out.println("Input number: " + num);

        boolean isPalin = solution.isPalindrome(num);

        if (isPalin) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
