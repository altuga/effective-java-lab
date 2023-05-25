package org.jugistanbul.question39;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
TODO:
 - Run the app
 - Problem : Speed up the application, sendMail() method is too slow
 - call sendMail method in an async way with Thread
*/
public class MailNinja {

    static ExecutorService exec = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {

        for (int i = 0; i < 10000; i++) {
            // call sendMail method in an async way with Thread
            int finalI = i;
            Runnable task = () -> sendMail(finalI);
            exec.submit(task);
        }
        exec.shutdown();

    }

    public static void mainx(String[] args) {


        for (int i = 0; i < 1000; i++) {
            // call sendMail method in an async way with Thread
            int finalI = i;
            Thread t = new Thread(() -> sendMail(finalI));
            t.start();
        }

    }

    public static void sendMail(int counter) {
        try {
            Thread.sleep(1000);
            System.out.println(" Mail send ... " + counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
