//on a dice how many ways to form 4

public class Dice_problem {
    public static void main(String[] args) {
        dice("",4);
    }
    static void dice(String p, int targ){
        if (targ == 0){
            System.out.println(p);
            return;
        }
        for (int i=1 ; i<=6 && i<= targ ; i++){
            dice(p+i, targ-i);
        }
    }
}
