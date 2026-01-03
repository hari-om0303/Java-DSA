public class CustomStack {
    protected int [] data;
    private static final int DEFAULIT_SIZE = 5;
    int ptr = -1;

    public CustomStack(){
        this(DEFAULIT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            System.out.println("stack is empty");
            throw new StackException("satck is empty");
        }
        return data[ptr--];
    }

    public int peek() throws StackException{
        if (isEmpty()){
            throw new StackException("can not peek from a empty stack");
        }
        return data[ptr];
    }

    public boolean isFull(){
          return ptr == data.length-1; // [tr is at last index
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack();
        stack.push(5);
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(35);
        stack.push(35);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }

}
