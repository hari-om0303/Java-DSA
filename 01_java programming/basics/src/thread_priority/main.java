package thread_priority;
class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority());
    }
}

public class main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        t1.setName("Thread-A");
        t2.setName("Thread-B");
        t3.setName("Thread-C");

        t1.start();
        t2.start();
        t3.start();
    }
}
