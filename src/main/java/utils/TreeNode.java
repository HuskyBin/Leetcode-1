package utils;

/**
 * @author Zhiwei.Xin
 * @version 1.0 on 5/31/2017.
 */
public final class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;
  public TreeNode(int x) {
    val = x;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof TreeNode)) {
      return false;
    }

    TreeNode treeNode = (TreeNode) o;

    return val == treeNode.val && (left != null ? left.equals(treeNode.left) : treeNode.left ==
        null) && (right != null ? right.equals(treeNode.right) : treeNode.right == null);
  }

  @Override
  public int hashCode() {
    int result = val;
    result = 31 * result + (left != null ? left.hashCode() : 0);
    result = 31 * result + (right != null ? right.hashCode() : 0);
    return result;
  }
}
