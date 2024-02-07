class Solution {
    public String frequencySort(String s) {
        
       Map<Character,Integer> map = new HashMap<>();

       for (char c : s.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
       }  
        List<Character> sortedChars = new ArrayList<>(map.keySet());
        Collections.sort(sortedChars, (a, b) -> map.get(b) - map.get(a));
        
        // Construct the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (char c : sortedChars) {
            int count = map.get(c);
            for (int i = 0; i < count; i++) {
                sortedString.append(c);
            }
        }
        
        return sortedString.toString();
    }
}
