package lecture5.interfaces.extendDemo;

public interface B extends A{
    void greet();
  @Override
    default void fun() {
        System.out.println("I am in B");
    }

//    void fun();
}