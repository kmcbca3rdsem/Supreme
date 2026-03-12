package Lab3;

interface Bank {
    void deposit();
}

class SavingAccount implements Bank {
    public void deposit() {
        System.out.println("Money deposited in saving account");
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.deposit();
    }
}