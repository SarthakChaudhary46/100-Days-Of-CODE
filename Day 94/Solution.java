class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>();
        queue.offer(new Pair<>(root, false));  // (node, is_left)
        int totalSum = 0;
        
        while (!queue.isEmpty()) {
            Pair<TreeNode, Boolean> pair = queue.poll();
            TreeNode node = pair.getKey();
            boolean isLeft = pair.getValue();
            
            if (isLeft && node.left == null && node.right == null) {
                totalSum += node.val;
            }
            
            if (node.left != null) {
                queue.offer(new Pair<>(node.left, true));
            }
            if (node.right != null) {
                queue.offer(new Pair<>(node.right, false));
            }
        }
        
        return totalSum;
    }
}
