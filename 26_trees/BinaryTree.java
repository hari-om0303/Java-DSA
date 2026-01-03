import java.util.Scanner;

public class BinaryTree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value){
             this.value = value;
        }
    }

    private Node root;

//    intertion of node
    public void populate(Scanner scanner){
        System.out.println("enter root element: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner , root);   // We call populate(scanner, root) to start the recursive construction of the binary tree from the root node.
    }

    private void populate(Scanner scanner , Node node){
        System.out.println("do u want to enter left side of : "+ node.value );
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("enter the left of the node : " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner , node.left);
        }
        System.out.println("do you want to enter right side of  the node : " + node.value);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("enter the right side of the :" + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner , node.right);
        }
    }

    public void  display(){
        display(this.root , "");
    }

    private void display(Node node ,String indent){
        if (node == null){
            return;
        }
        System.out.println(indent + node.value);
        display(node.left , indent + "\t");    //Adds one tab (\t) for indentation , Shows child is one level deeper
        display(node.right , indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        // print right subtree first
        prettyDisplay(node.right, level + 1);

        // indentation
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("| \t\t");
            }
            System.out.println("|----> " + node.value);
        } else {
            System.out.println(node.value);
        }
        // print left subtree
        prettyDisplay(node.left, level + 1);
    }

//    PREORDER
    public void preorder(){
        preorder(root);
    }

    private void preorder(Node node){
        if (node == null){
            return;
        }
        System.out.println(node.value + "");
        preorder(node.left);
        preorder(node.right);
    }

    //  INORDER
    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if (node == null){
            return;
        }
        inorder(node.left);
        System.out.println(node.value + "");
        inorder(node.right);
    }

//    POSTORDER
public void postorder(){
    postorder(root);
}
    private void postorder(Node node){
        if (node == null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.value + "");
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
//        tree.prettyDisplay();

        tree.preorder();

    }
}
