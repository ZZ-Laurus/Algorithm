package 二叉树;

/**
 * @author Laurus
 * @Description
 * @ClassName TreeNode
 * @date 2023-08-26 19:52
 */
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

