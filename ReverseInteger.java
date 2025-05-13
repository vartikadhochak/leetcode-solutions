class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow before multiplying by 10
            if (result > Integer.MAX_VALUE / 10 || result < Integer.MIN_VALUE / 10) {
                return 0; // Overflow check
            }
            result = result * 10 + digit;
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseInteger sol = new ReverseInteger();

        System.out.println(sol.reverse(123));   // Output: 321
        System.out.println(sol.reverse(-123));  // Output: -321
        System.out.println(sol.reverse(120));   // Output: 21
        System.out.println(sol.reverse(1534236469)); // Output: 0 (overflow)
    }
}
