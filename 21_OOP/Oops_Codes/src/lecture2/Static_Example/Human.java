package lecture2.Static_Example;

public class Human {
    public static void main(String[] args) {
        System.out.println(Human.population);
    }

    int age ;
    String name;
    int Salary;
    Boolean married;
    static long population;

    static void msg(){
        System.out.println("hii");
//        System.out.println(this.age); //can't use over here
    }

    public Human(int age, String Name, int Salary, Boolean married){
        this.age = age;
        this.name = Name;
        this.Salary = Salary;
        this.married = married;
//        this.population += 1;
        Human.population +=1 ;
    }
}
