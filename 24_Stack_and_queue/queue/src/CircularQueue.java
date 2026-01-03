public class CircularQueue {
    protected int front = 0;
    protected int end = 0;
    protected int [] data;
    private static final int DEFAULT_SIZE = 4;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int [size];
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
       int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()){
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void Display(){
        if (isEmpty()){
            if (isEmpty()){
                System.out.println("Empty");
            }
            return;
        }
       int i = front;

        do {
            System.out.print(data[i] + "->");
            i++;
            i %= data.length;
        }while (i != end);

        System.out.println("END");
    }

    public static void main(String[] args) throws Exception {
        CircularQueue cq = new CircularQueue();
        cq.insert(5);
        cq.insert(54);
        cq.insert(52);
        cq.insert(51);

        cq.Display();

        System.out.println(cq.remove());
        cq.Display();

    }

}
