package Interface;

public class main {
    public static void main(String[] args) {
    i2.f2();
    c1 c = new c1();
    c.f2();
    }
}

interface i1 {
    int x = 6 ;
    void f1();
    static void f2(){
        System.out.println(x);
    }
}
interface i2 extends i1{
    int x =9;
    int y =2;
    static void f2(){
        System.out.println(x);
    }
    void f3();
}
class c1 implements i2 {
    static void f2(){
        System.out.println(x);
    }

    @Override
    public void f1() {

    }

    @Override
    public void f3() {

    }
}