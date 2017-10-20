package interviews.linkedin._101_Symmetric_Tree;

import utils.TreeNode;

/**
 * @author jacka
 * @version 1.0 on 10/19/2017.
 */
public class Solution {
  public boolean isSymmetric(TreeNode root) {
    if (root == null) {
      return true;
    }
    return isSymmetric(root.left, root.right);
  }

  private boolean isSymmetric(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    } else if (left != null && right != null) {
      return left.val == right.val && isSymmetric(left.left, right.right) &&
          isSymmetric(left.right, right.left);
    } else {
      return false;
    }
  }
}
