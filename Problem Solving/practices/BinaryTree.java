package practices;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTree {
    
    // Function to find the distance of the closest leaf from the given node
    public int findClosestLeaf(TreeNode root, TreeNode target) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        
        if (root == target) {
            return findClosestLeafFromNode(root);
        }
        
        int leftDistance = findClosestLeaf(root.left, target);
        int rightDistance = findClosestLeaf(root.right, target);
        
        return Math.min(leftDistance, rightDistance) + 1;
    }
    
    // Function to find the distance of the closest leaf from a given node
    private int findClosestLeafFromNode(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        
        if (node.left == null && node.right == null) {
            return 0;
        }
        
        int leftDistance = findClosestLeafFromNode(node.left);
        int rightDistance = findClosestLeafFromNode(node.right);
        
        return Math.min(leftDistance, rightDistance) + 1;
    }
    
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(9);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(8);
        
        TreeNode target = root.left;
        
        int distance = tree.findClosestLeaf(root, target);
        System.out.println("Distance to closest leaf from target: " + distance);
    }
}
