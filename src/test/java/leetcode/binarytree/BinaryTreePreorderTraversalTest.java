package leetcode.binarytree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class BinaryTreePreorderTraversalTest {

    /**
     * Input: root = [1,null,2,3]
     * Output: [1,2,3]
     */
    @Test
    void preorderTraversal() {
        BinaryTreePreorderTraversal cut = new BinaryTreePreorderTraversal();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));
        List<Integer>expectedResult = Arrays.asList(1,2,3);

        List<Integer> result = cut.preorderTraversal(root);

        assertNotNull(result);

    }

}