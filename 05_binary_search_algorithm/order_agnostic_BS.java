//Order agnostic binary search me:
//Pehle check karte ho ki array ascending hai ya descending.
//Us order ke hisaab se binary search ka comparison logic change karte ho.
public class order_agnostic_BS {
    public static void main(String[] args) {
        int[] arrAsc = {21, 32, 33, 43, 54, 66, 77, 88};
        int[] arrDesc = {88, 77, 66, 54, 43, 33, 32, 21};

        System.out.println(orderAgnosticBS(arrAsc, 33));   // Ascending test
        System.out.println(orderAgnosticBS(arrDesc, 33));  // Descending test
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // check order

        while (start <= end) {
            int mid = start + (end - start) / 2; // calculate mid every loop

            if (arr[mid] == target) {
                return mid; // found target
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // target not found
    }
}
