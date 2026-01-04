import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leet_637_avg_of_levels {
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

    static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();

        if (root == null){
            return ans;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

       while (! queue.isEmpty()){
        int size = queue.size();

         double sum = 0;
           for (int i=0; i<size; i++){
            TreeNode node = queue.poll();

               sum += node.val;;

               if (node.left!=null) queue.add(node.left);
               if (node.right !=null) queue.add(node.right);

           }
           ans.add(sum/size);
       }
       return ans;
    }

    public static void main(String[] args) {
        TreeNode root =
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7)));

        System.out.println(averageOfLevels(root));
    }
}
