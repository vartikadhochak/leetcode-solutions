public class FactraZero {
    public int trailingZeroes(int n) {
        int count = 0;
        // Keep dividing n by 5, 25, 125... and add to count
        while (n >= 5) {
            n /= 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        FactraZero solution = new FactraZero();
        
        int n1 = 3;
        int n2 = 5;
        int n3 = 100;
        
        System.out.println("Number of trailing zeroes in " + n1 + "! is: " + solution.trailingZeroes(n1));
        System.out.println("Number of trailing zeroes in " + n2 + "! is: " + solution.trailingZeroes(n2));
        System.out.println("Number of trailing zeroes in " + n3 + "! is: " + solution.trailingZeroes(n3));
    }
}
