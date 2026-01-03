package runnable_interface;

public class main {
    public static void main(String[] args) {
        one o = new one();
        two t = new two();
        Thread t1 = new Thread(o);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
class one implements Runnable{
    @Override
    public void run() {
        for (int i=0 ; i<=10 ; i++){
            System.out.println("process 1 :" + i);
        }
    }
}class two implements Runnable{
    @Override
    public void run() {
        for (int i=0 ; i<=10 ; i++){
            System.out.println("process 2 :" + i);
        }
    }
}