package Week_7.Day_46;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Balance_a_Binary_Search_Tree_1382 {
//    // Class member to hold the tree values in sorted order.
//    private List<Integer> treeValues;
//
//    //Method to turn a binary search tree into a balanced binary search tree.
//    public TreeNode balanceBST(TreeNode root){
//        treeValues = new ArrayList<>();
//        //Populate the treeValues list with the values in sorted order.
//        inOrderTraversal(root);
//        //Reconstruct the tree in a balanced manner
//        return buildBalancedTree(0, treeValues.size() - 1);
//    }
//
//    //Helper method to perform an in-order traversal of the tree and store the values.
//    private void inOrderTraversal(TreeNode node){
//        if (node == null){
//            //Base case: if the node is null, do nothing.
//            return;
//        }
//        //Traverse the left subtree first.
//        inOrderTraversal(node.left);
//        //Store the value of the current node.
//        treeValues.add(node.val);
//        //Traverse the right subtree next.
//        inOrderTraversal(node.right);
//    }
//    //Helper method to build a balanced binary search tree using the stored the values.
//    private TreeNode buildBalancedTree(int start, int end){
//        //Base case: if start index is greater than end index, subtree is null.
//        if (start > end){
//            return null;
//        }
//        // Find the mid-point to make the current root.
//        int mid = start + (end - start) / 2;
//        //Create a new TreeNode with the mid value.
//        TreeNode root = new TreeNode(treeValues.get(mid));
//        // Recursively build the left subtree.
//        root.left = buildBalancedTree(start, mid - 1);
//        // Recursively build the right subtree.
//        root.right = buildBalancedTree(mid + 1, end);
//        // Return the node.
//        return root;
//    }
}
