import java.util.Scanner;

class FirstNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, num = 2;

        System.out.print("Enter n: ");
        n = sc.nextInt();

        while (count < n) {
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
