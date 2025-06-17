import java.util.Arrays;

public class CountPrimes{
    public static int countPrimes(int n) {
        if (n < 2) return 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n1 = 10;
        System.out.println("Primes less than " + n1 + ": " + countPrimes(n1)); // Output: 4

        int n2 = 0;
        System.out.println("Primes less than " + n2 + ": " + countPrimes(n2)); // Output: 0
    }
}