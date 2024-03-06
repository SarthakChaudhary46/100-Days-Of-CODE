public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        return detectCycle(head, head.next);
    }

    private boolean detectCycle(ListNode slow, ListNode fast) {
        if (fast == null || fast.next == null) {
            return false;
        }

        if (slow == fast) {
            return true;
        }

        return detectCycle(slow.next, fast.next.next);
    }
}
