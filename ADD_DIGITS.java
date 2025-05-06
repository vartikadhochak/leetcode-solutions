// ADD_DIGITS.java

public class ADD_DIGITS {

    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        ADD_DIGITS solution = new ADD_DIGITS();

        int num = 38;  // Example input

        System.out.println("Input number: " + num);

        int result = solution.addDigits(num);

        System.out.println("Result after repeatedly adding digits: " + result);
    }
}
