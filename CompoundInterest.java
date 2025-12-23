package miniprojects;

import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle:");
        double p = input.nextDouble();

        System.out.print("Enter Annual Rate(%):");
        double r = input.nextDouble() /100;// Convert percent to decimal

        System.out.print("Enter Number of times interest is compounded per year:");
        double t = input.nextDouble();

        System.out.print("Enter No of Years:");
        double y = input.nextDouble();

        double amount = p * Math.pow((1 + r/t),t*y);
        System.out.printf("Total Amount = %.2f",amount);

        double cp = amount - p;
        System.out.printf("Compound Interest = %.2f",cp);

        input.close();
    }
}
