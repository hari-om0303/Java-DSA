package DATE_AND_TIME;

public class time extends Thread{
    public static void main(String[] args) {
        System.out.println("current time : "+ System.currentTimeMillis());
        System.out.println("time : "+ System.currentTimeMillis()/1000/3600/24/365);
    }
}
