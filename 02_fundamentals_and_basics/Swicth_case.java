import java.util.Scanner;

public class Swicth_case {
    public static void main(String[] args) {
        String fruit = "mango";

        switch (fruit){
            case "mango":
                System.out.println("my favorite");
                break;
            case "grapes":
                System.out.println("uuuumha");
                break;
            case "apple":
                System.out.println("good for health");
                break;
            default:
                System.out.println("all fruits are good for health");
        }


//        2nd way
        String car = "volvo";
        switch(car){
            case "volvo" -> System.out.println("what a car ");
            case "mercedese" -> System.out.println("what a luxury car ");
            case "rolls royce" -> System.out.println("heven");
            case "bugati" -> System.out.println("father of car");
            default -> System.out.println("all car's are good ");
        }

    }
}
