import java.util.*;

// Java Program to Illustrate First Argument
class leetcode107{

    public static class TreeNode {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0; i<size; i++){
              TreeNode node = queue.poll();
              level.add(node.val);

              if (node.left != null) queue.add(node.left);
              if (node.right != null) queue.add(node.right);
            }
          result.add(level);
        }
        Collections.reverse(result);
    return result;
    }

    public static void main(String[] args) {
        leetcode107 obj = new leetcode107();

        TreeNode root =
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7)));

        System.out.println(obj.levelOrderBottom(root));
    }
}