class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int left = 0;
        int right = heights.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (canReach(heights, bricks, ladders, mid)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return left - 1;
    }
    
    private boolean canReach(int[] heights, int bricks, int ladders, int target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i = 0; i < target; i++) {
            int diff = heights[i + 1] - heights[i];
            if (diff > 0) {
                pq.offer(diff);
                if (pq.size() > ladders) {
                    bricks -= pq.poll();
                    if (bricks < 0) return false;
                }
            }
        }
        
        return true;
    }
}
