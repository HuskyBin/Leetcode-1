package interviews.linkedin._297_Serialize_and_Deserialize_Binary_Tree;

import utils.TreeNode;

/**
 * @author jacka
 * @version 1.0 on 10/22/2017.
 */
public interface Codec {
  // Encodes a tree to a single string.
  String serialize(TreeNode root);

  // Decodes your encoded data to tree.
  TreeNode deserialize(String data);

}
