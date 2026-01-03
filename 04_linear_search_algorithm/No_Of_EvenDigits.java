public class No_Of_EvenDigits {
    public static void main(String[] args) {
        int [] arr = {12,423,56,423,4,456,32,32,32};
        System.out.println(findNumb(arr));
    }
    static int findNumb(int []arr){
        int count = 0;
        for (int i=0 ; i< arr.length; i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigit = digit(num);
        if(numberofdigit%2 ==0){
            return true;
        }
        return false;
    }
    static int digit(int num){
        int count =0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }

}
