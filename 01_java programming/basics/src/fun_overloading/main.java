package fun_overloading;

public class main {
    public static void main(String[] args) {
        first f = new first();
        f.f1();
        f.f2(4);
        f.f3(5,6);
    }
}
class first{
    void f1(){
        System.out.println("f1 function");
    }
    void f2(int x ){
        System.out.println(x);
    }
    void f3(int p, int q){
        System.out.println(p+q);
    }
}
