class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i: arr){
            map.put(i, map.getOrDefault(i,0)+1);
        }

        for(int i:map.values()){
            if(!set.contains(i)){
                set.add(i);
            }else{
                return false;
            }
        }

        return true;
    }
}
