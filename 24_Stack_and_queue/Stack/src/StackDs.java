import java.util.Stack;

public class StackDs {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(4);
        stack.push(24);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
