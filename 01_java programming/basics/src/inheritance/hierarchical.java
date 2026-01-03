package inheritance;

public class hierarchical {
    public static void main(String[] args) {
        two t = new two();
        three th = new three();
        t.f1();
        t.f2();
        th.f1();
        th.f3();
    }
}
class one {
    int x=10;
    int y=2;
    void f1(){
        System.out.println(x+y);
    }
}
class two extends one{
    void f2(){
        System.out.println(x-y);
    }
}
class three extends one {
    void f3(){
        System.out.println(x*y);
    }
}
