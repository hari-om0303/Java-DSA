public class DynamicQueue extends CircularQueue {
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item){
        if (isFull()){
            int [] temp = new int[data.length*2];

            for (int i=0; i< data.length; i++){
                temp[i] = data[(front +i ) % data.length];
            }
                front = 0;
                end = data.length;
                data = temp;
        }
        return super.insert(item);
    }


    public static void main(String[] args) throws Exception {
        DynamicQueue cq = new DynamicQueue();
        cq.insert(5);
        cq.insert(54);
        cq.insert(52);
        cq.insert(51);
        cq.insert(1);
        cq.insert(21);

        cq.Display();

        System.out.println(cq.remove());
        cq.Display();

    }
}
