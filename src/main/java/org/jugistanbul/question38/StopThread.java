package org.jugistanbul.question38;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/** TODO
* How long would you expect this program to run?
*/
public class StopThread {
    private static AtomicBoolean stopRequested = new AtomicBoolean();

    public static void main(String[] args)
            throws InterruptedException {

        Thread backgroundThread = new Thread(() -> {

            int i = 0;
            System.out.println(Thread.currentThread().getName() + " " + i);
            while (!stopRequested.get())
                i++;
            System.out.println("Finito");
        });
        backgroundThread.start();

        System.out.println(Thread.currentThread().getName());
        TimeUnit.SECONDS.sleep(1);
        stopRequested.set(true);

    }
}