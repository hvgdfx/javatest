package com.test.thread;

public class waitTest extends Thread {

    @Override
    public void run() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " notify a thread..");
            notify();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        waitTest w = new waitTest();
        synchronized (w) {
            System.out.println(Thread.currentThread().getName() + "start w");
            w.start();
            System.out.println(Thread.currentThread().getName() + "wait w");
            w.wait();
            System.out.println(Thread.currentThread().getName() + "wake up w");
        }
    }
}
