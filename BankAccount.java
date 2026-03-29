import java.util.*;

class BankAccount {
    double balance = 1000;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class ATM {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){;
        BankAccount acc = new BankAccount();

        while (true) {
            System.out.println("1.Deposit 2.Withdraw 3.Check 4.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    acc.deposit(sc.nextDouble());
                    break;
                case 2:
                    acc.withdraw(sc.nextDouble());
                    break;
                case 3:
                    acc.checkBalance();
                    break;
                case 4:
                    return;
            }
        }
    }
}

}
