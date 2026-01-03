
class my {
    static void funA(){
        System.out.println("area of fun A ");
    }
    static void funB(){
        System.out.println("area of fun B ");
    }
}
public class Main {
    static void fun1(){
        System.out.println("area of fun 1 ");
    }
    static void fun2(){
        System.out.println("area of fun 2 ");
    }
    void fun3(){
        System.out.println("area of fun 3 ");
    }

    public static void main(String[] args) {
        Main.fun1();
        Main.fun2();
        Main m = new Main();
        m.fun3();

        my n = new my();
        n.funA();
        n.funB();
    }
}