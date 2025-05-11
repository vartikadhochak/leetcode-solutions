public class CountOddsInRange {
    // Method to count odd numbers between low and high (inclusive)
    public static int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }

    // Main method for testing
    public static void main(String[] args) {
        int low = 3;
        int high = 7;

        int result = countOdds(low, high);

        System.out.println("Count of odd numbers between " + low + " and " + high + ": " + result);
    }
}
