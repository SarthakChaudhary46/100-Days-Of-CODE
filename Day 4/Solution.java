class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> winners = new HashSet<>();
        Map<Integer,Integer> losers = new HashMap<>();

        for (int[] match : matches){
            losers.put(match[1], losers.getOrDefault(match[1],0)+1);
        }
        for(int[] match : matches){
            if(!losers.containsKey(match[0])){
                winners.add(match[0]);
            }

        }

        List<Integer> WL = new ArrayList<>(winners);
        List<Integer> LL = new ArrayList<>();

        for(int loser : losers.keySet()){
            if(losers.get(loser) == 1){
                LL.add(loser);
            }
        }

        Collections.sort(WL);
        Collections.sort(LL);

        List<List<Integer>> result = new ArrayList<>();
        result.add(WL);
        result.add(LL);

        return result;
    }
}
