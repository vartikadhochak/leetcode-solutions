public class SegmentCounter{
    public static int countSegments(String s) {
        if (s == null || s.length() == 0) return 0;
        String[] parts = s.trim().split("\\s+");
        return parts.length == 1 && parts[0].equals("") ? 0 : parts.length;
    }
    public static void main(String[] args) {
        String s = "Hello, my name is John";
        System.out.println("Segments: " + countSegments(s)); // Output: 5
    }
}
