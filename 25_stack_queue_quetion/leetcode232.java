import java.util.Stack;

class leetcode232 {

    Stack <Integer> firstStack;
    Stack <Integer> secondStack;

    public leetcode232() {
        firstStack = new Stack<>() ;
       secondStack = new Stack<>();
    }

    public void push(int x) {
         firstStack.push(x);
    }

    public int pop() {
         while (!firstStack.isEmpty()){
             secondStack.push(firstStack.pop());
         }
         int removed = secondStack.pop();
         while (!secondStack.isEmpty()){
             firstStack.push(secondStack.pop());
         }
         return  removed;
    }

    public int peek() {
          while (!firstStack.isEmpty()){
             secondStack.push( firstStack.pop());
          }
          int peeked = secondStack.peek();
          while (!secondStack.isEmpty()){
              firstStack.push(secondStack.peek());
          }
          return  peeked;
    }

    public boolean empty() {
     return firstStack.isEmpty();
    }

    public static void main(String[] args) {
        leetcode232 lc = new leetcode232();
        lc.firstStack.push(20);
        lc.firstStack.push(21);
        lc.firstStack.push(22);
        lc.firstStack.push(23);

        System.out.println(lc.firstStack);

         lc.secondStack.push(10);
         lc.secondStack.push(30);
         lc.secondStack.push(20);
        System.out.println(lc.secondStack);

        lc.push(5);
        lc.push(50);
        lc.push(23);
        System.out.println(lc.pop());
        System.out.println(lc.pop());
        System.out.println(lc.pop());

    }
}

