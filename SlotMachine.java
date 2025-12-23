package miniprojects;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    static void main() {
        //Java Slot Machine

        //Declare Variables
        Scanner input = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain= "y";

        //Display Welcome message
        System.out.println("   Welcome to java Slot   ");
        System.out.println("     🍒 🍉 🥭 🔔 ⭐      ");

        //Play if balance > 0
        while(balance > 0){
            System.out.println("Current balance: $"+ balance);

            //Enter bet amount
            System.out.print("Place your bet amount: ");
            bet = input.nextInt();
            input.nextLine();

            //   verify if net > balance
            if(bet > balance){
                System.out.println("Insufficient amount");
                continue;
            }//   verify if bet > 0
            else if(bet <= 0){
                System.out.println("Bet must be greater than 0");
                continue;
            }//   subtract bet from balance
            else{
                balance -= bet;
            }
            //spin row
            System.out.println("Spinning...");
            row = spinRow();

            //print row
            printRow(row);

            //get payout
            payout = getPayOut(row, bet);

            if(payout > 0){
                System.out.println("You Won $"+payout);
                balance += payout;
            }else{
                System.out.println("You Lost this round");
            }

            //ask to play again
            System.out.print("Do you Want to play again? (y/n): ");
            playAgain = input.nextLine().toLowerCase();

            if(!playAgain.equals("y")){
                break;
            }
        }
        //exit message
        System.out.println("Thank You!! Your Final Balance = "+ balance);
        input.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍒", "🍉", "🥭", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();

        for(int i = 0; i< 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ",row));
    }
    static int getPayOut(String[] row,int bet){
        if(row[0].equals(row[1])  && row[1].equals(row[2]) ){
            return switch(row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🥭" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }
        return 0;
    }
}
