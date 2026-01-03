package leet202;

public class leet202 {

    private leet202.Node head;
    private leet202.Node tail;
    private int size;

    private class Node{
        int val;
        leet202.Node next;
        Node(int val){
            this.val = val;
        }
        Node(int val, leet202.Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        leet202.Node node = new leet202.Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        leet202.Node node = new leet202.Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void printList() {
        leet202.Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean isHappy(int n) {
          int f = n;
          int s = n;

          do {
              s = findSquare(s);
              f = findSquare(findSquare(f));
          }while (s != f);

          if (s == 1){
              return true;
          }
          return false;
    }

    private int findSquare(int num ){
        int ans = 0;
        while (num>0){
            int rem  = num%10;
            ans += rem*rem;
            num = num/10;
        }
        return ans;
    }

    public static void main(String[] args) {
        leet202 l = new leet202();

      boolean res =   l.isHappy(19);
        System.out.println(res);
    }

}
