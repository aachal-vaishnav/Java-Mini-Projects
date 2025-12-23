package miniprojects;

import java.util.Scanner;

public class NumGuessGame {
    int random ;
    NumGuessGame(){
        random = (int) Math.ceil(Math.random() * 100);
    }
    /** guessNumber the number player guess
     * negative if the number is smaller
     * 0 if number is correct
     * positive if number is greater */
    int guess(int guessNumber){
        return guessNumber - random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumGuessGame game = new NumGuessGame();
        System.out.println("Welcome to Number Guessing Game");
        int guess;
        int result;

        do{
            System.out.print("Guess the number: ");
            guess = input.nextInt();
            result = game.guess(guess);
            if(result == 0){
                System.out.println("Congratulation you won");
            }else if(result < 0){
                System.out.println("Guess Higher");
            }else{
                System.out.println("Guess Lower");
            }
        }while (result != 0 );
        input.close();
    }
}
