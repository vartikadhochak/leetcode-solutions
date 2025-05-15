public class SumSqNum {
    public static void main(String[] args) {
        int c1 = 5;
        int c2 = 3;

        System.out.println("Input: " + c1 + " → Output: " + judgeSquareSum(c1)); // true
        System.out.println("Input: " + c2 + " → Output: " + judgeSquareSum(c2)); // false
    }

    public static boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;

            if (sum == c) return true;
            else if (sum < c) a++;
            else b--;
        }

        return false;
    }
}
