package thread_class;

public class main {
    public static void main(String[] args) {
        one o = new one();
        two t = new two();
        o.start();
        t.start();
    }
}
class one extends Thread{
    @Override
    public void run() {
        for (int i=0 ; i<=10 ; i++){
            System.out.println("process 1 :" + i);
        }
    }
}class two extends Thread{
    @Override
    public void run() {
        for (int i=0 ; i<=10 ; i++){
            System.out.println("process 2 :" + i);
        }
    }
}