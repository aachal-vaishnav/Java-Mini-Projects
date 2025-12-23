package miniprojects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    static void main() {
        //rock paper scissor game
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock","Paper","Scissor"};
        String userChoice ;
        String computerChoice;

        String playAgain ="y";

        do {
            System.out.print("Enter You Choice(Rock, Paper, Scissor): ");
            userChoice = input.nextLine().toLowerCase();

            if (!userChoice.equals("rock") &&
                    !userChoice.equals("paper") &&
                    !userChoice.equals("scissor")) {
                System.out.println("Invalid Choice");
                continue;
            }
            computerChoice = choices[random.nextInt(3)]; //0,1,2-> choices array value
            System.out.println("Computer Choice: " + computerChoice);

            if (userChoice.equalsIgnoreCase(computerChoice)) {
                System.out.println("It's Tie");
            } else if ((userChoice.equals("rock") && computerChoice.equalsIgnoreCase("scissor")) ||
                    (userChoice.equals("paper") && computerChoice.equalsIgnoreCase("rock")) ||
                    (userChoice.equals("scissor") && computerChoice.equalsIgnoreCase("paper"))) {

                System.out.println("You Win");

            } else {
                System.out.println("You loss");
            }
            System.out.println("You want to play again(y/n)");
            playAgain = input.nextLine().toLowerCase();

        }while(playAgain.equals("y"));
    }
}
