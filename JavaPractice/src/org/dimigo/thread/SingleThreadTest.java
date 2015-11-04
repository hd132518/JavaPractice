package org.dimigo.thread;

import java.util.Random;

public class SingleThreadTest {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.toString());

        int time = new Random().nextInt(10000); // 0 ~ 9999
        System.out.println("first sleep time : " + time);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        time = new Random().nextInt(10000); // 0 ~ 9999
        System.out.println("second sleep time : " + time);

        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
