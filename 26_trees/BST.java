import java.util.Scanner;

public class BST {

    private  static  class Node{
     private int value;
       private Node left;
       private Node right;
       private int height;

        public Node(int value){
            this.value = value;
        }

        public int getvalue(){
            return value ;
        }
    }

    private Node root;

    public int height(Node node){
         if (node == null){
             return -1;
         }
         return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int value){
       root = insert(value , root );
    }

    private Node insert(int value , Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }
        if (value < node.value ){
            node.left = insert(value , node.left);
        }
        if (value > node.value ){
            node.right = insert(value, node.right);
        }
        node.height = Math.max( height(node.left) , height(node.right) ) + 1;
        return node;
    }

    public void populate(int [] nums){
       for (int i=0 ; i<nums.length ; i++ ){
           this.insert(nums[i]);
       }
    }

//    if the array is sorted
   public void populatesorted(int [] nums){
         populatesorted( nums , 0 , nums.length);
   }

   private void populatesorted(int [] nums , int start , int end){
        if (start >= end){
            return;
        }

        int mid = ( start + end ) / 2 ;

       insert(nums[mid]);

        populatesorted(nums , start , mid );
        populatesorted(nums , mid+1 , end );
   }

   public boolean balance(){
        return balance(root);
   }

   private boolean  balance(Node node){
        if (node == null){
            return true;
        }
       return Math.abs(height(node.left) - height(node.right)) <= 1 && balance(node.left) && balance(node.right);
   }


    public void display(){
        display(this.root , "root node: ");
    }
    private void display(Node node , String details){
       if (node == null){
           return;
       }
        System.out.println(details + node.value);
       display(node.left , "left child of" + node.value + " ");
       display(node.right , "right child of" + node.value + " ");
    }


    public static void main(String[] args) {
        BST tree = new BST();
//        int [] nums = {1,9,2,3,8,4,5,4,6};
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        tree.populatesorted(nums);
        tree.display();

    }
}
