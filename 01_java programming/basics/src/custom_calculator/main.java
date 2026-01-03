package custom_calculator;

import com.sun.source.tree.BreakTree;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class invalidinput extends Exception{
    public String toString(){
        return "can not add 8 and 9";
    }
}

class Maxinputexception extends Exception{
    public String toString(){
        return "input can not be greater then 10000";
    }
}

class dividebyzero extends Exception{
    public String toString(){
        return "can not devide by zero";
    }
}

class maxmultiplyinput extends Exception{
    public String toString(){
        return "can not multiply by large values";
    }
}

class calculator{
    int fval , sval;
   double add() throws invalidinput, maxmultiplyinput, Maxinputexception {
       Scanner sc = new Scanner(System.in);
       System.out.print("enter first value: ");
       fval = sc.nextInt();

       System.out.print("enter second value: ");
       sval = sc.nextInt();

       if (fval>10000 || sval>10000){
           throw new Maxinputexception();
       }
       if(fval==8 || sval ==9){
           throw new invalidinput();
       }
       System.out.println("sum is : " +  (fval+sval));
 return fval+sval;
   }

    double sub() throws invalidinput, maxmultiplyinput, Maxinputexception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value: ");
        fval = sc.nextInt();

        System.out.print("enter second value: ");
        sval = sc.nextInt();

        if (fval>10000 || sval>10000){
            throw new Maxinputexception();
        }
        System.out.println("sub is : " +  (fval-sval));
        return fval-sval;
    }

    double multiply() throws invalidinput, maxmultiplyinput, Maxinputexception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value: ");
        fval = sc.nextInt();

        System.out.print("enter second value: ");
        sval = sc.nextInt();

        if (fval>10000 || sval>10000){
            throw new Maxinputexception();
        }
        System.out.println("multiply is : " +  fval*sval);
        return fval*sval;
    }

    double devision() throws invalidinput, maxmultiplyinput, dividebyzero ,Maxinputexception {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first value: ");
        fval = sc.nextInt();

        System.out.print("enter second value: ");
        sval = sc.nextInt();

        if (fval>10000 || sval>10000){
            throw new Maxinputexception();
        }
        System.out.println("division is : " +  fval/sval);
        return fval/sval;
    }
}

public class main {
    public static void main(String[] args) throws invalidinput ,Maxinputexception , maxmultiplyinput ,dividebyzero {
        calculator c = new calculator();
        c.add();
        c.sub();
        c.multiply();
        c.devision();
    }
}
