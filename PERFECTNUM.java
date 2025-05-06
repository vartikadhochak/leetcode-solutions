// PERFECTNUM.java

public class PERFECTNUM {

    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;  // 1 is always a divisor
        int sqrt = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                int pairedDivisor = num / i;
                if (pairedDivisor != i) {
                    sum += pairedDivisor;
                }
            }
        }

        return sum == num;
    }

    public static void main(String[] args) {
        PERFECTNUM solution = new PERFECTNUM();

        int num = 28;  // Example input (28 is a known perfect number)

        System.out.println("Input number: " + num);

        boolean isPerfect = solution.checkPerfectNumber(num);

        if (isPerfect) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}
