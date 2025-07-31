class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to hold lists of anagrams
        Map<String, List<String>> map = new HashMap<>();
        
        // Iterate over each string in the input array
        for (String str : strs) {
            // Convert the string into a character array, then sort it to generate a key
            char[] chars = str.toCharArray();
            java.util.Arrays.sort(chars);
            String key = new String(chars);
            
            // If the key doesn't exist in the map, add it with a new list
            if (!map.containsKey(key)) {
                map.put(key, new java.util.ArrayList<>());
            }
            
            // Add the current string to the list corresponding to the key
            map.get(key).add(str);
        }
        
        // Return the values (groups of anagrams) from the map
        return new java.util.ArrayList<>(map.values());
    }
}
