package miniprojects;

import java.util.Timer;
import java.util.TimerTask;

public class CountDown {
    static void main(String[] args)throws InterruptedException{
        loopCount();
        timerCount();
    }

    static void timerCount(){
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count =5;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("Happy New Year!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,1000);//task,delay,period
    }
    static void loopCount() throws InterruptedException{
        int start = 10;
        for (int i = start; i > 0 ; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY NEW YEAR!");
    }

}
