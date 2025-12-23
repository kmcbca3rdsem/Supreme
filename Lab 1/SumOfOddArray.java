import java.util.Scanner;

class SumOfOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter array size: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 != 0)
                sum += arr[i];
        }

        System.out.println("Sum of odd numbers = " + sum);
    }
}
