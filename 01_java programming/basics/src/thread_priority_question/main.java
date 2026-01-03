package thread_priority_question;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        account a =new account(5000);
        customer c = new customer(a ,"amit");
        customer d = new customer(a ,"sumit");
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();

    }
}

class account {
    int bal = 5000;
    account(int b) {
        bal = b;
    }
    boolean issufficientbalance(int w) {
        if (w > bal) {
            return false;
        } else {
            return true;
        }
    }
    void withdraw(int amt, String g1) {
        bal = bal - amt;
        System.out.println(g1 + " transaction successful");
        System.out.println(g1 + " current balance is " + bal);
    }
}
    class customer implements Runnable {
        String m1;
        account x1;

        customer(account j1, String h1) {
            x1 = j1;
            m1 = h1;
        }

        public void run() {
            Scanner s1 = new Scanner(System.in);
            synchronized (x1) {
                System.out.println("enter amount to withdraw for" + m1);
                int amt = s1.nextInt();
                if (x1.issufficientbalance(amt)) {
                    x1.withdraw(amt, m1);
                } else {
                    System.out.println("insufficient balance");
                }
            }
        }
}

