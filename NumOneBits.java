public class NumOneBits{
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1; // Unsigned right shift
        }
        return count;
    }

    public static void main(String[] args) {
        NumOneBits solution = new NumOneBits();
        System.out.println(solution.hammingWeight(11));    // Output: 3
        System.out.println(solution.hammingWeight(128));  // Output: 1
    }
}