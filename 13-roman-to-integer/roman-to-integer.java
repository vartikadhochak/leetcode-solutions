class Solution {
    public int romanToInt(String s) {
        // Mapping of Roman numerals to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int total = 0;
        
        // Loop through the string
        for (int i = 0; i < s.length(); i++) {
            // Get the current value of the current character
            int currentVal = romanMap.get(s.charAt(i));
            
            // If we're not at the last character and the current character is smaller than the next
            if (i + 1 < s.length() && currentVal < romanMap.get(s.charAt(i + 1))) {
                total -= currentVal; // Subtract it
            } else {
                total += currentVal; // Otherwise, add it
            }
        }
        
        return total; // Return the final calculated value
    }
}
