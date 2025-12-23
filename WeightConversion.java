package miniprojects;

import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight ;
        double newWeight ;
        int choice ;

        System.out.println("Weight Conversion program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = input.nextInt();

        //option 1 : lbs to kgs
        if(choice == 1){
            System.out.println("Enter the weight tn lbs: ");
            weight = input.nextDouble();
            newWeight = weight * 0.453592 ;
            System.out.println("The new weight in kgs is: "+ newWeight);
        }else if(choice == 2){
            System.out.println("Enter the weight tn kgs: ");
            weight = input.nextDouble();
            newWeight = weight * 2.20462 ;
            System.out.printf("The new weight in lbs is: %.2f ",  newWeight);
        }else{
            System.out.println("That was not a valid choice");
        }
        input.close();
    }
}
