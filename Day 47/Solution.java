class Solution {
    public class DiameterData {
        int diameter;
        int height;
        DiameterData(int diameter, int height) {
            this.diameter = diameter;
            this.height = height;
        }
    }

    public DiameterData calculateDiameterAndHeight(TreeNode root) {
        if (root == null) {
            return new DiameterData(0, 0);
        }

        DiameterData leftData = calculateDiameterAndHeight(root.left);
        DiameterData rightData = calculateDiameterAndHeight(root.right);

        int currentDiameter = Math.max(leftData.height + rightData.height, 
                                        Math.max(leftData.diameter, rightData.diameter));
        int currentHeight = Math.max(leftData.height, rightData.height) + 1;

        return new DiameterData(currentDiameter, currentHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        // Calculate diameter and height using helper function
        DiameterData data = calculateDiameterAndHeight(root);
        
        // Return the diameter (maximum path length)
        return data.diameter;
    }
}
