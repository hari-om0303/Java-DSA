public class SegmentTree2 {
    class Node{
        int startInterval;
        int endInterval;
        int data;
        Node left;
        Node right;

    public Node(int startInterval , int endInterval){
        this.startInterval = startInterval;
        this.endInterval = endInterval;
    }
    }

    private Node root;

    public SegmentTree2(int [] nums){
        this.root = this.constructTree(nums , 0 , nums.length-1);
    }

    public Node constructTree(int [] nums , int start , int end){
           if (start == end){
               Node leaf = new Node(start , end);
               leaf.data = nums[start];
               return leaf;
           }

           Node node = new Node(start , end);
           int mid = (start+end)/2;

           node.left = constructTree(nums , start , mid);
           node.right = constructTree(nums , mid+1 , end);

           node.data = node.left.data + node.right.data;

           return node;
    }

    public void display() {
        display(this.root);
    }
    private void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + " => ";
        } else {
            str = str + "No left child";
        }

        // for current node
        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + " <= ";

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data;
        } else {
            str = str + "No right child";
        }

        System.out.println(str + '\n');

        // call recursion
        if(node.left != null) {
            display(node.left);
        }

        if(node.right != null) {
            display(node.right);
        }
    }

//    Query
    public int query(int qsi , int qei){
        return this.query(this.root , qsi , qei );
    }
    private int query(Node node, int qsi, int qei) {
        // safety check
        if (node == null) {
            return 0;
        }
        // completely inside query range
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }
        // completely outside query range
        if (node.endInterval < qsi || node.startInterval > qei) {
            return 0;
        }
        // partial overlap
        return query(node.left, qsi, qei) + query(node.right, qsi, qei);
    }

    //  point  update
    public void updateindex(int index , int value){
        this.root.data = updateindex(this.root ,index, value );
    }
    private int updateindex(Node node , int index , int value){
        if ( index >= node.startInterval && index <= node.endInterval){
            if (index == node.startInterval && index == node.endInterval) {
                node.data = value;
                return node.data;
            }else {
                int leftasn = updateindex(node.left , index , value);
                int rightans = updateindex(node.right , index , value);
                node.data = leftasn + rightans;
                return node.data;
            }
        }
        return node.data;
    }


    public static void main(String[] args) {
        int [] arr = {3,4,5,6,3,4,5,2,2};
        SegmentTree1 st = new SegmentTree1(arr);
//        st.display();
        System.out.println(st.query(1,4));
       st.updateindex(1, 10);
        System.out.println(st.query(1,4));
    }

}
