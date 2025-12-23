class BankAccount {
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    void displayBalance() {
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNumber = 101;
        b.balance = 5000;

        b.deposit(2000);
        b.withdraw(1500);
        b.displayBalance();
    }
}
