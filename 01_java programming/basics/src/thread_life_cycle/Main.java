package thread_life_cycle;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
        try {
            Thread.sleep(1000);  // TIMED_WAITING
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();   // NEW
        System.out.println("State 1: " + t.getState());

        t.start();                     // RUNNABLE
        System.out.println("State 2: " + t.getState());

        try {
            Thread.sleep(500);
            System.out.println("State 3: " + t.getState()); // TIMED_WAITING or RUNNABLE
            t.join(); // wait for thread to finish
            System.out.println("State 4: " + t.getState()); // TERMINATED
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

