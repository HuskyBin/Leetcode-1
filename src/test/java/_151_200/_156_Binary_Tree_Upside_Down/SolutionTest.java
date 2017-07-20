package _151_200._156_Binary_Tree_Upside_Down;

import org.junit.Before;
import org.junit.Test;
import utils.TreeNode;
import utils.TreeNodes;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @Test
    public void testOneElement() throws Exception {
        TreeNode input = TreeNodes.getTreeLevelOrder(1);
        TreeNode expected = TreeNodes.getTreeLevelOrder(1);
        assertEquals(expected, solution.upsideDownBinaryTree(input));
    }

    @Test
    public void testTwoElements() throws Exception {
        TreeNode input = TreeNodes.getTreeLevelOrder(1, 2, null);
        TreeNode expected = TreeNodes.getTreeLevelOrder(2, null, 1);
        assertEquals(expected, solution.upsideDownBinaryTree(input));
    }

    @Test
    public void testTwoLevelsFull() throws Exception {
        TreeNode input = TreeNodes.getTreeLevelOrder(1, 2, 3);
        TreeNode expected = TreeNodes.getTreeLevelOrder(2, 3, 1);
        assertEquals(expected, solution.upsideDownBinaryTree(input));
    }

    @Test
    public void testThreeLevels() throws Exception {
        TreeNode input = TreeNodes.getTreeLevelOrder(1, 2, 3, 4, 5, null, null);
        TreeNode expected = TreeNodes.getTreeLevelOrder(4, 5, 2, null, null, 3, 1);
        assertEquals(expected, solution.upsideDownBinaryTree(input));
    }
}