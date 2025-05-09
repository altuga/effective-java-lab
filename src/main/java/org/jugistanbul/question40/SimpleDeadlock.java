package org.jugistanbul.question40;

public class SimpleDeadlock {
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public void method1() {
        synchronized (lock1) {
            System.out.println("Method 1: Holding lock1...");
            try {
                Thread.sleep(100); // Delay to help create deadlock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized (lock2) {
                System.out.println("Method 1: Holding lock1 & lock2");
            }
        }
    }

    public void method2() {
        synchronized (lock2) {
            System.out.println("Method 2: Holding lock2...");
            try {
                Thread.sleep(100); // Delay to help create deadlock
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            synchronized (lock1) {
                System.out.println("Method 2: Holding lock2 & lock1");
            }
        }
    }

    public static void main(String[] args) {
        SimpleDeadlock deadlock = new SimpleDeadlock();

        // Thread 1 tries to acquire lock1 then lock2
        Thread thread1 = new Thread(() -> {
            while (true) {
                deadlock.method1();
            }
        }, "Thread-1");

        // Thread 2 tries to acquire lock2 then lock1
        Thread thread2 = new Thread(() -> {
            while (true) {
                deadlock.method2();
            }
        }, "Thread-2");

        thread1.start();
        thread2.start();
    }
}