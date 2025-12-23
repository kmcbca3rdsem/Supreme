import java.util.Scanner;

class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp;

        System.out.print("Enter array size: ");
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

        System.out.println("Sorted array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}
