package inheritance;

public class multilevel_inheritance {
    public static void main(String[] args) {
        multi m = new multi();
        m.f1();
        m.f2();
        m.f3();
    }
}
class sum {
    int x=10;
    int y=2;
    void f1(){
        System.out.println(x+y);
    }
}
class sub extends sum{
    void f2(){
        System.out.println(x-y);
    }
}
class multi extends sub {
    void f3(){
        System.out.println(x*y);
    }
}