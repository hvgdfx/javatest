package com.test.thread;

public class lock implements Runnable {

    static int j = 100;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " --- " + j--);
        }
    }

    public static void main(String[] args) {
        lock l = new lock();

        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);

        t1.start();
        t2.start();

    }
}
