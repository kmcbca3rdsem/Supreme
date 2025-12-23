import java.util.Scanner;

class OperatorsMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, choice;

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println("1.Add  2.Subtract  3.Multiply  4.Divide");
        choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Sum = " + (a + b)); break;
            case 2: System.out.println("Difference = " + (a - b)); break;
            case 3: System.out.println("Product = " + (a * b)); break;
            case 4: System.out.println("Quotient = " + (a / b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
