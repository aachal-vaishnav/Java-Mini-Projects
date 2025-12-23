package miniprojects;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.awt.Toolkit;

public class AlarmClock {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<LocalTime> alarms = new ArrayList<>();
        DateTimeFormatter formatterWithSeconds = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatterWithoutSeconds = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Enter alarm times (HH:mm or HH:mm:ss). Type 'done' to finish:");

        while (true) {
            System.out.print("Alarm time: ");
            String userInput = input.nextLine();

            if (userInput.equalsIgnoreCase("done")) break;

            LocalTime alarmTime = null;

            try {
                if (userInput.length() == 5) { // HH:mm
                    alarmTime = LocalTime.parse(userInput, formatterWithoutSeconds);
                } else if (userInput.length() == 8) { // HH:mm:ss
                    alarmTime = LocalTime.parse(userInput, formatterWithSeconds);
                } else {
                    throw new DateTimeParseException("Invalid format", userInput, 0);
                }

                // If time already passed, schedule for next day
                if (alarmTime.isBefore(LocalTime.now())) {
                    System.out.println("Time has passed today, scheduling for tomorrow.");
                }

                alarms.add(alarmTime);
                System.out.println("Alarm set for " + alarmTime);

            } catch (DateTimeParseException e) {
                System.out.println("Invalid time format! Use HH:mm or HH:mm:ss");
            }
        }

        // Start threads for each alarm
        for (LocalTime alarmTime : alarms) {
            Thread alarmThread = new Thread(new Alarm(alarmTime));
            alarmThread.start();
        }

        input.close();
    }
}

class Alarm implements Runnable {
    private final LocalTime alarmTime;

    public Alarm(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
    }

    @Override
    public void run() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Waiting for alarm at " + alarmTime);

        while (true) {
            LocalTime now = LocalTime.now();
            System.out.print("\rCurrent Time: " + now.format(formatter));

            // Check if alarm time reached
            if (!now.isBefore(alarmTime)) {
                System.out.println("\nTime's up! Alarm ringing: " + alarmTime);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                break;
            }

            try {
                Thread.sleep(500); // check twice a second for accuracy
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
