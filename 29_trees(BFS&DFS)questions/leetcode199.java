import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode199 {


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

    public List<Integer> rightSideView(TreeNode root) {
         List<Integer> result = new ArrayList<>();
             if (root == null) {
                 return result;
             }

        Queue<TreeNode> queue = new LinkedList<>();
             queue.add(root);

             while (! queue.isEmpty()){
                 int size = queue.size();

                 for (int i=0; i<size; i++){
                   TreeNode node = queue.poll();

                   if (i == size-1){
                       result.add(node.val);
                   }

                   if (node.left != null)  queue.add(node.left);
                   if (node.right != null) queue.add(node.right);

                 }
             }
             return result;
    }

    public static void main(String[] args) {
         leetcode199 obj = new leetcode199();

        // STEP 1: Create nodes
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node4 = new TreeNode(4);

        // STEP 2: Connect nodes
        root.left = node2;
        root.right = node3;
        node2.right = node5;
        node3.right = node4;

//        passing root to function
        List<Integer> answer = obj.rightSideView(root);

        // STEP 4: Print result
        System.out.println(answer);
    }
}
