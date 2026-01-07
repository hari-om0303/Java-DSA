public class leetcode_116 {

    public static class Node {
        int val;
        Node left;
        Node right;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public Node connect(Node root) {
        if (root == null) return null;

        Node leftmost = root;

        // since tree is perfect, leftmost.left != null is enough
        while (leftmost.left != null) {

            Node current = leftmost;

            while (current != null) {

                // connect left -> right
                current.left.next = current.right;

                // connect right -> next.left
                if (current.next != null) {
                    current.right.next = current.next.left;
                }

                current = current.next;
            }

            leftmost = leftmost.left;
        }
        return root;
    }

    // helper to print next pointers
    public void printNextPointers(Node root) {
        Node level = root;
        while (level != null) {
            Node curr = level;
            while (curr != null) {
                System.out.print(curr.val + " -> ");
                curr = curr.next;
            }
            System.out.println("null");
            level = level.left;
        }
    }

    public static void main(String[] args) {

        leetcode_116 obj = new leetcode_116();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        obj.connect(root);
        obj.printNextPointers(root);
    }
}
