package Week_3.Day_16;

public class Min_Depth_Binary_Tree_111 {
    // First option
//    public int minDepth(TreeNode root) {
//        if(root == null){
//            return 0;
//        }
//        if(root.left == null){
//            return 1 + minDepth(root.right);
//        }else if (root.right == null){
//            return 1 + minDepth(root.left);
//        }
//        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
//    }

    //Second option:
//    public int minDepth(TreeNode root) {
//        return root == null ? 0 : getMinDepth(root);
//    }
//
//    private int getMinDepth(TreeNode node) {
//        if (node == null) return Integer.MAX_VALUE;
//        if (node.left == null && node.right == null) return 1;
//
//        return Math.min(getMinDepth(node.left), getMinDepth(node.right)) + 1;
//    }
}
