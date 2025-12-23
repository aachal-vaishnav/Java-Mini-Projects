package miniprojects;

import java.util.Scanner;

//a practice program for shopping cart
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String item;
        double price;
        char currency = '$';
        int quantity;
        double total;

        System.out.println("What Customer buy(food item):");
        item = input.nextLine();

        System.out.println("Price of that Item:");
        price = input.nextDouble();

        System.out.println("How much Quantity:");
        quantity = input.nextInt();

        System.out.println("Total amount to pay:");
        total = price * quantity;

        System.out.println("Customer Buy "+quantity+" "+item+" of price "+price+currency+" And total is "+total);

        input.close();
    }
}
