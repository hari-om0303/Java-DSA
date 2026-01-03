package lecture2.Static_Example;


public class Main {
    public static void main(String[] args) {
        Human Hariom = new Human(20, "Hariom", 9999999, false);
        Human Hardik = new Human(19, "Hardik", 9999990, true);
        Human Harsh = new Human(19, "Harsh", 9999900, true);
        System.out.println( Hariom.name);
        System.out.println( Hardik.name);
        System.out.println( Harsh.name);

        System.out.println(Human.population);
    }

    static void fun(){
//        greeting();  you can not call a non-static function inside a static function

        // hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){
        fun2();
    }

    void fun2(){
      greeting();
    }
}
