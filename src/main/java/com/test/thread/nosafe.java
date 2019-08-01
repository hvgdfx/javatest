package com.test.thread;

public class nosafe implements Runnable {

    static int j = 100;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " --- " + j--);
        }
    }

    public static void main(String[] args) {

        nosafe n1 = new nosafe();

        Thread t1 = new Thread(n1);
        Thread t2 = new Thread(n1);

        t1.start();
        t2.start();

    }
}
