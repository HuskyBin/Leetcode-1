package _101_150._113_Path_Sum_II;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import utils.TreeNode;
import utils.TreeNodes;

import static org.junit.Assert.assertEquals;

/**
 * @author jacka
 * @version 1.0 on 6/22/2017.
 */
public class SolutionTest {
  private Solution solution;
  @Before
  public void setUp() throws Exception {
    solution = new Solution();
  }

  @Test
  public void testOnlineCase() throws Exception {
    TreeNode root = TreeNodes.getTreeLevelOrder(5, 4, 8, 11, null, 13, 4);
      root.left.left.left = new TreeNode(7);
      root.left.left.right = new TreeNode(2);
      root.right.right.left = new TreeNode(5);
      root.right.right.right = new TreeNode(1);
    List<List<Integer>> expected = new ArrayList<>();
      expected.add(Arrays.asList(5, 4, 11, 2));
      expected.add(Arrays.asList(5, 8, 4, 5));
    assertEquals(expected, solution.pathSum(root, 22));
  }

}