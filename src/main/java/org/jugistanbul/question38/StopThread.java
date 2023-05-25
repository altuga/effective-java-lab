package org.jugistanbul.question38;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/** TODO
* How long would you expect this program to run?
*/
public class StopThread {
    private static boolean stopRequested;

    public static synchronized boolean isStopRequested() {
        return stopRequested;
    }

    public static synchronized void setStopRequested(boolean stopRequested) {
        StopThread.stopRequested = stopRequested;
    }

    public static void main(String[] args)
            throws InterruptedException, IOException {

        System.out.println(Thread.currentThread().getName());
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            System.out.println(Thread.currentThread().getName());
            while (!isStopRequested())
                i++;
            System.out.println("Finito");
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        setStopRequested(true);


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(bufferedReader.readLine());;
    }


}