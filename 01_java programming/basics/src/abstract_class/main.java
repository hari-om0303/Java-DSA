package abstract_class;

public class main {
    public static void main(String[] args) {
       class2 c= new class2();
       c.fun3();

    }
}
abstract class class1{
    int x ,y;
    void fun1(){
        x=5;
        y=2;
    }
    abstract void fun2();
class1(){
    System.out.println("abstract(parent) class construtor");
}
}
class class2 extends class1{
    int x ;
    void fun3(){
      int  z=10;
        System.out.println(z);
    }
    void fun2(){
    }
    class2(){
        System.out.println("child class constructor");
    }
}
