package miniprojects;

import java.util.Scanner;

public class QuizGame {
    static void main() {
        //Quiz Game
        Scanner input = new Scanner(System.in);

        String[] questions = {"1.Capital of India",
                              "2.First PM of India",
                              "3.Age Limit For Vote in India",
                              "4.Which of the following is leap year",
                              "5.Which of the following is known as wine city"};

        String[][] options = {
                {"1.Mumbai","2.Delhi","3.Nashik","4.Pune"},
                {"1.Dr.Manmohan Singh","2.Dr.APJ Abdul Kalam","3.Pandit Nehru","4.Lal Bahadur Shastri"},
                {"1.20","2.18","3.21","4.17"},
                {"1.2001","2.2002","3.2004","4.2003"},
                {"1.Mumbai","2.Delhi","3.Nashik","4.Pune"}
        };

        int[] answers ={2,3,2,3,3};
        int score = 0;
        int guess;

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("------------------");
            for(String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your option no.: ");
            guess = input.nextInt();

            if(guess == answers[i]){
                System.out.println("Correct!!!");
                System.out.println("********************");
                score++;
            }else{
                System.out.println("Wrong!!!");
            }
        }
        System.out.println("You Score = "+score+ "/"+questions.length);
        input.close();
    }
}
