package lecture5.interfaces.extendDemo;

public class Main implements B{

    @Override
    public void greet() {
        System.out.println("greet");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.greet();

        Main obj = new Main();
        A.greeting();
        obj.fun();
    }

}