package com.test.thread;

public class yeildTest extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " i: " + i);
            if (i % 2 == 0) {
                Thread.yield();
            }
        }
    }


    public static void main(String[] args) {
        yeildTest y1 = new yeildTest();
        yeildTest y2 = new yeildTest();

        y1.start();
        y2.start();

    }
}
