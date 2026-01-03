public class AVL {

    class Node {
        int value;
        int height;
        Node left, right;

        public Node(int value) {
            this.value = value;
            this.height = 0;
        }
    }

    private Node root;

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) return new Node(value);

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        } else {
            return node; // duplicate ignored
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return rotate(node);
    }

    private Node rotate(Node node) {
        int balance = height(node.left) - height(node.right);

        // LL
        if (balance > 1 && height(node.left.left) >= height(node.left.right)) {
            return rightRotate(node);
        }

        // LR
        if (balance > 1 && height(node.left.left) < height(node.left.right)) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RR
        if (balance < -1 && height(node.right.right) >= height(node.right.left)) {
            return leftRotate(node);
        }

        // RL
        if (balance < -1 && height(node.right.right) < height(node.right.left)) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private Node rightRotate(Node p) {
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    private Node leftRotate(Node p) {
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right)) + 1;
        c.height = Math.max(height(c.left), height(c.right)) + 1;

        return c;
    }

    public int height(Node node) {
        return node == null ? -1 : node.height;
    }

    public void populateSorted(int[] nums) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int[] nums, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        insert(nums[mid]);

        populateSorted(nums, start, mid);
        populateSorted(nums, mid + 1, end);
    }

    public int height() {
        return height(root);
    }

    public static void main(String[] args) {
        AVL avl = new AVL();
        for (int i = 1; i < 100; i++) {
            avl.insert(i);
        }
        System.out.println(avl.height()); // ≈ log2(1000)
    }
}
