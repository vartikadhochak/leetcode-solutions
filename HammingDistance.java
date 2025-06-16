public class HammingDistance{
    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    public static void main(String[] args) {
        int x1 = 1, y1 = 4;
        System.out.println("Hamming distance between " + x1 + " and " + y1 + " is: " + hammingDistance(x1, y1)); // Output: 2
        
        int x2 = 3, y2 = 1;
        System.out.println("Hamming distance between " + x2 + " and " + y2 + " is: " + hammingDistance(x2, y2)); // Output: 1
    }
}