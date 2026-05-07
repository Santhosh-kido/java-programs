
import java.util.*;

class Atm {

    private int AccountNumber = 123456;
    private int balance = 300;
    private int pin = 2020;
    private int totalbalance = balance;

    public void deposit(int amount, int acc_num) {
        if (acc_num == AccountNumber) {
            totalbalance = balance + amount;
            System.out.println("Amount Deposited Successfully!!");
        } else {
            System.out.println("Invalid Account Number!! ");
        }
    }

    public void withdraw(int withrawAmount, int enter_pin) {

        if (enter_pin == pin && withrawAmount <= totalbalance) {
            totalbalance -= withrawAmount;
            System.out.println("Amount Withdrawn Successfully!!");
            System.out.println("Remaining Balance : " + totalbalance);
        } else {
            System.out.println("invalid Account Number or amount!!");
        }
    }

    public void getBalance(int enter_pin) {
        if (enter_pin == pin)

            System.out.println("Balance : "+totalbalance);

    }

    public static void main(String[] args) {
        Atm ob1 = new Atm();
        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.println(" ****Automated Teller Machine (ATM)****");
            System.out.println("1. Withraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance");
            System.out.println("press any key to Exit");
            System.out.print("Enter Your choise: ");
            int choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter an amount to withraw: ");
                int w_Amount = s.nextInt();
                System.out.print("Enter your pin: ");
                int acc_pin = s.nextInt();
                ob1.withdraw(w_Amount, acc_pin);
            } else if (choice == 2) {
                System.out.print("Enter Account Number: ");
                int acc_pin = s.nextInt();
                System.out.print("Enter an Amount to Deposite: ");
                int d_Amount = s.nextInt();
                ob1.deposit(d_Amount, acc_pin);
            } else if (choice == 3) {
                System.out.print("Enter your Pin: ");
                int acc_pin = s.nextInt();
                ob1.getBalance(acc_pin);
            } else
                break;
        }
        s.close();
    }

}
