package com.test.thread;

public class joinTest extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {
        joinTest j = new joinTest();

        System.out.println(Thread.currentThread().getName() + " start");
        j.start();

        System.out.println(Thread.currentThread().getName() + "join");
//        j.join();

        System.out.println(Thread.currentThread().getName() + "wake up");
    }
}
