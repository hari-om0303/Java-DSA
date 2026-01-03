public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }

    public DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if (isFull()){
            int [] temp = new int [data.length*2];

            for (int i=0; i< data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }

    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // earlier this would throw "stack full"

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }

}
