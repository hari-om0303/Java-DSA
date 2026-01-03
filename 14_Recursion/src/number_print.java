public class number_print {
    public static void main(String[] args) {
        System.out.println("Ascending:");
        printAscending(0);

        System.out.println("\nDescending:");
        printDescending(5);

        System.out.println("\nDescending:");
        printDescending2(0);
    }

    // prints 0 to 5
    static void printAscending(int n) {
        if (n > 5) {
            return;
        }
        System.out.println(n);
        printAscending(n + 1);
    }

    // prints 5 to 0
    static void printDescending(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        printDescending(n - 1);
    }

    // prints 5 to 0
    static void printDescending2(int n) {
        if (n==6) {
            return;
        }
        printDescending2(n+1);
        System.out.println(n);
    }
}
