class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        // Dummy head to handle edge case when nodes at the beginning sum to zero
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Prefix sum initialization
        int prefixSum = 0;
        
        // Map to store the first occurrence of a prefix sum and its corresponding node
        Map<Integer, ListNode> prefixSumToNode = new HashMap<>();
        
        // Iterate over the list
        for (ListNode current = dummy; current != null; current = current.next) {
            prefixSum += current.val;
            // If this prefix sum has been seen before, it means the sublist sums to zero
            if (prefixSumToNode.containsKey(prefixSum)) {
                // Retrieve the node where this prefix sum was first seen
                ListNode prev = prefixSumToNode.get(prefixSum);
                ListNode toRemove = prev.next;
                int p = prefixSum + (toRemove != null ? toRemove.val : 0);
                
                // Remove nodes between 'prev' and 'current' from the map
                while (p != prefixSum) {
                    prefixSumToNode.remove(p);
                    toRemove = toRemove.next;
                    p += (toRemove != null ? toRemove.val : 0);
                }
                
                // Connect the previous node with current's next, effectively removing the zero-sum sublist
                prev.next = current.next;
            } else {
                // If this is a new prefix sum, just add it to the map
                prefixSumToNode.put(prefixSum, current);
            }
        }
        // Return the modified list, without the dummy head
        return dummy.next;
        // UPVOTE :)
    }
}
