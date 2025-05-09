class bulbswi {

    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }

    public static void main(String[] args) {
        bulbswi solution = new bulbswi();

        int n = 10; // Example input
        int result = solution.bulbSwitch(n);

        System.out.println("Number of bulbs that remain on for n = " + n + ": " + result);
    }
}
