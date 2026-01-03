public class CustomQueue {
    private int [] data;
    private static final int DEFAULIT_SIZE = 4;
    int end = 0;

    public CustomQueue(){
        this(DEFAULIT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if (isfull()){
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty");
        }

        int removed = data[0];
//        shift the element to the left
        for (int i=1; i<end ; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;

    }

    public int front() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[0];
    }

    public boolean isEmpty(){
    return end == 0;
    }
    public boolean isfull(){
        return end == data.length;
    }

    public void display(){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + "<-");
        }
        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CustomQueue q = new CustomQueue();
        q.insert(5);
        q.insert(50);
        q.insert(55);
        q.insert(53);
        q.insert(52);

        q.display();

        System.out.println(q.remove());
        System.out.println(q.remove());
        q.display();
    }
}
