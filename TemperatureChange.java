package miniprojects;

import java.util.Scanner;

public class TemperatureChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature: ");
        double temp = input.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit(C/F): ");
        String unit = input.next().toUpperCase();

        double ans = (unit.equals("C")) ? ((temp - 32)* 5/9) : ((temp * 9/5) + 32);
        System.out.printf("%.1f %s",ans,unit);
        input.close();
    }
}
