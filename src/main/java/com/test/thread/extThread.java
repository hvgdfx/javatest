package com.test.thread;

public class extThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(getName() + "---" + i);
        }
    }

    public static void main(String[] args) {
        extThread t1 = new extThread();
        extThread t2 = new extThread();

        t1.start();
        t2.start();

    }
}
