package _101_150._112_Path_Sum;

import org.junit.Before;
import org.junit.Test;

import utils.TreeNode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
  public void testInCompletedTreeTrue() throws Exception {
    final TreeNode root = new TreeNode(1);
      root.left = new TreeNode(2);
    assertTrue(solution.hasPathSum(root, 3));
  }

  @Test
  public void testInCompletedTreeFalse() throws Exception {
    final TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    assertFalse(solution.hasPathSum(root, 1));
  }
}