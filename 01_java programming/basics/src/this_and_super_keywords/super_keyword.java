package this_and_super_keywords;

public class super_keyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();

        Child c = new Child();
        c.show();
    }
}
class Animal {
    void speak() {
        System.out.println("Animal speaks");
    }
}

class Dog extends Animal {
    void speak() {
        super.speak();  // calls Animal's speak()
        System.out.println("Dog barks");
    }
}
//-----------------------------------------------------------------------------------------------------------

class Parent {
    int x = 10;
}

class Child extends Parent {
    int x = 20;

    void show() {
        System.out.println(super.x); // prints 10
        System.out.println(x); // prints 20
    }
}