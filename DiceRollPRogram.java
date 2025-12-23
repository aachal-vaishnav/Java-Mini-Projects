package miniprojects;

import java.util.Random;
import java.util.Scanner;

public class DiceRollPRogram {
    static void main() {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int noOfDice ;
        int total = 0;
        System.out.print("Enter the number of dice to roll: ");
        noOfDice= input.nextInt();

        if(noOfDice > 0){
            for(int i = 0; i< noOfDice; i++){
                int roll = random.nextInt(1,7);
                System.out.println("you roll: "+ roll);
                printDie(roll);
                total = total + roll;
            }
            System.out.println("Total = "+total);
        }else{
            System.out.println("Number of dice must be greater than 0");
        }
        input.close();
    }

    static void printDie(int roll){
        String dice1 = """
                -------
               |   ●   |
                -------
               \s""";
        String dice2 = """
                -------
               |   ●   |
               |   ●   |
                -------
               \s""";
        String dice3 = """
                -------
               |   ●   |
               |   ●   |
               |   ●   |
                -------
               \s""";
        String dice4 = """
                -------
               |  ● ●  |
               |  ● ●  |
                -------
               \s""";
        String dice5 = """
                -------
               |  ● ●  |
               |  ● ●  |
               |   ●   |
                -------
               \s""";
        String dice6 = """
                -------
               |  ● ●  |
               |  ● ●  |
               |  ● ●  |
                -------
               \s""";

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
