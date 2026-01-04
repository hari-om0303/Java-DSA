import java.util.*;

public class leet_103_zigzag_level {
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

    static List<List<Integer>> ZigZagLevelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

       int level = 0;
        while (! queue.isEmpty()){
            int size = queue.size();
        List<Integer> currentlevel = new ArrayList<>();

            for (int i=0 ; i<size; i++){
            TreeNode node = queue.poll();
                currentlevel.add(node.val);

            if(node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        if (level % 2 ==1){
            Collections.reverse(currentlevel);
        }
        result.add(currentlevel);
        level++;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root =
                new TreeNode(3,
                        new TreeNode(9),
                        new TreeNode(20,
                                new TreeNode(15),
                                new TreeNode(7)));
        System.out.println(ZigZagLevelOrder(root));

    }
}
