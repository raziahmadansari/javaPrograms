import java.util.Scanner;

class Account {
    private int id;
    private static int tempid = 100;
    private double balance;
    private double annualInterestRate;

    Account() {
        this.id = tempid++;
        this.balance = 500;
        this.annualInterestRate = 4;
    }

    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }


    double getMonthlyInterest() {
        return (this.annualInterestRate * 100) / 12;
    }

    void withdraw(double balance) {
        if(this.balance >= balance) {
            this.balance -= balance;
            System.out.println("withdrawal successfull\nremaining balance = " + this.balance);
        }
        else
            System.out.println("insufficient account balance\nbalance in your account :: " + this.balance);
    }

    void deposit(double balance) {
        this.balance += balance;
        System.out.println("deposit successfully\ntotal balance :: " + this.balance);
    }

    void showid() {
        System.out.println("id = " + this.id);
    }

    void checkBalance() {
        System.out.println("account balance = " + this.balance);
    }
}


public class class_program_1 {
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(99, 1000, 12);
        Account a3 = new Account();

        System.out.println("account id of a1, a2, a3");
        a1.showid();a2.showid();a3.showid();
        System.out.println("\n\n");

        System.out.println("account balance of a1, a2, a3");
        a1.checkBalance();a2.checkBalance();a3.checkBalance();
        System.out.println("\n\n");

        System.out.println("withdrawing 600 rupees from a1");
        a1.withdraw(600);
        System.out.println("\ndepositing 100 rupees in a1");
        a1.deposit(100);
        System.out.println("\nwithdrawing 600 rupees form a1");
        a1.withdraw(600);
    }
}
