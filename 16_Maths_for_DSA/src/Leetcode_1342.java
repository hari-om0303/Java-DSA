public class Leetcode_1342 {
    public static void main(String[] args) {

        System.out.println(numberOfSteps(14));
    }
    static int numberOfSteps(int num) {
       return even(num,0);
    }

    static int even(int num , int steps){
        if (num == 0){
            return steps;
        }
        if (num % 2 ==0){
            return even(num/2, steps+1);
        }
        return even(num-1, steps+1);
    }
}
