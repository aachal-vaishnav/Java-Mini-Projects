package miniprojects;

import java.util.Scanner;

public class BankingProgram {

    static Scanner input = new Scanner(System.in);
    static void main(String[] args) {
        //declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;
        //choices
        System.out.println("Banking Program");

        while (isRunning){
            System.out.println("1.Show Balance 2.Deposit money 3.Withdraw money 4.Exit");
            //switch case enhance
            System.out.print("Enter your choice(1-4):");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += depositMoney();
                case 3 -> balance -= withdrawMoney(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice");
            }
        }
        input.close();
    }

    //show balance
    static void showBalance(double balance){
        System.out.println(balance);
    }
    //deposit
    static double depositMoney(){
        System.out.print("Enter Amount to deposit:");
        double amount = input.nextDouble();
        if(amount <= 0){
            System.out.println("You should enter valid amount");
            return 0;
        }else{
            return amount;
        }
    }
    //withdraw
    static double withdrawMoney(double balance){
        System.out.print("Enter Amount to withdraw:");
        double amount = input.nextDouble();
        if(amount > balance || amount <= 0){
            System.out.println("You don't have sufficient balance");
            return  0;
        }else{
            return amount;
        }
    }
}
