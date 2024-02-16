import java.util.HashMap;
import java.util.Map;

class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        // Count the occurrences of each number
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Count the number of unique integers
        int uniqueIntegers = map.size();

        // Sort the map entries based on their values (occurrences)
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());

        // Remove k occurrences starting from the integers with lowest occurrences
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int occurrences = entry.getValue();
            if (k >= occurrences) {
                k -= occurrences;
                uniqueIntegers--;
            } else {
                break;
            }
        }

        return uniqueIntegers;
    }
}
