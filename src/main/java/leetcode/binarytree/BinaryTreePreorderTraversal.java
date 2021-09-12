
package leetcode.binarytree;

import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return the preorder traversal of its nodes' values.
 *
 Input: root = [1,null,2,3]
 Output: [1,2,3]
 **/

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root != null){
            result.add(root.val);
            if(root.left != null){
                result.addAll(preorderTraversal(root.left));
            }
            if(root.right != null){
                result.addAll(preorderTraversal(root.right));
            }
        }
        return result;
    }
}

