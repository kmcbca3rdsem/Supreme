import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
