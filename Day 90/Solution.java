class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Arrays.sort(deck);
        Deque <Integer> st=new ArrayDeque<>();
        st.addFirst(deck[n-1]);
        for(int i=n-2;i>=0;i--){
            st.addFirst(st.removeLast());
            st.addFirst(deck[i]);
        }
        //we can either create a new array or change the existing since we dont need it right??but it is not recommended 

        for(int i=0;i<n;i++){
            deck[i]=(int)st.removeFirst();
        }
        return deck;
    }
}
