public class Leetcode_1672 {
    public static void main(String[] args) {
        int[][] acc = {{2, 3, 1}, {4, 6, 2}, {5, 2, 9}};
        int maxWealth1 = MaxValAcc1(acc);
        System.out.println(maxWealth1);

        int maxWealth2 = MaxValAcc2(acc);
        System.out.println(maxWealth2);
    }

    static int MaxValAcc1(int[][] acc) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : acc) {
            int sum = 0;
            for (int anint : ints) {
                sum = sum + anint;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }


    //without enhanced for loop
    static int MaxValAcc2(int[][] acc) {
        int ans = Integer.MIN_VALUE;

        // Outer loop - row wise
        for (int i = 0; i < acc.length; i++) { // i = customer index
            int sum = 0;

            // Inner loop - column wise
            for (int j = 0; j < acc[i].length; j++) { // j = bank index
                sum = sum + acc[i][j];
            }

            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }


}