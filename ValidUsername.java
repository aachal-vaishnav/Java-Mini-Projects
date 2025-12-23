package miniprojects;

import java.util.Scanner;

public class ValidUsername {
    //username must be in 6-12 and not contain space 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();

        if(username.length() < 6 || username.length() > 12){
            System.out.println("username must be greater than 6 and less than 12");
        }else if(username.contains(" ")|| username.contains("_")){
            System.out.println("username cant contain space or _ ");
        }else{
            System.out.println("Welcome "+username);
        }
        input.close();
    }
}
