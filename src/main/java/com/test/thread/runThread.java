package com.test.thread;

public class runThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + i);
        }
    }

    public static void main(String[] args) {

        runThread my = new runThread();

        Thread t1 = new Thread(my);
        Thread t2 = new Thread(my);

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();

    }
}
