package miniprojects;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        double num1 = input.nextDouble();

        input.nextLine();

        System.out.print("Enter Operator (+,-,*,/,^): ");
        String op = input.next();

        System.out.print("Enter Number 2: ");
        double num2 = input.nextDouble();

        double ans = 0.0;
        switch(op){
            case "+" ->ans =  num1 + num2 ;
            case "-" ->ans =num1 - num2 ;
            case "*" ->ans = num1 * num2 ;
            case "/" -> {
                if (num2 != 0) {
                    ans = num1 / num2;
                }else{
                    System.out.println("Cannot Divide by Zero");
                    return;
                }
            }
            case "^" ->ans = Math.pow(num1,num2) ;
            default -> {
                System.out.println("Invalid Input!");
                return;
            }

        }
        System.out.println(ans);
        input.close();
    }
}
