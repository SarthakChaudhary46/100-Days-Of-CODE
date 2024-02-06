import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        // Map to store anagram groups
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        // Iterate through each word in the input array
        for (String word : words) {
            // Sort the characters in the word to create a key
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            
            // If key is not in the map, add a new entry with the word as a list
            if (!anagramGroups.containsKey(key)) {
                anagramGroups.put(key, new ArrayList<>(List.of(word)));
            }
            // If key is already present, append the word to the existing list
            else {
                anagramGroups.get(key).add(word);
            }
        }
        
        // Convert map values to a list and return
        return new ArrayList<>(anagramGroups.values());
    }
}
