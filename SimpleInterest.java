package miniprojects;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal loan amount (you borrow this):");
        double principal = input.nextDouble();
        System.out.print("Enter Monthly interest rate (Annual Rate / 12 / 100)");
        double rate = input.nextDouble();
        System.out.print("Enter Loan Tenure (in years): ");
        int time = input.nextInt();


        double SI = (principal * rate * time)/100;
        System.out.print("\nSimple Interest= "+SI);

        input.close();
    }
}
