package org.dimigo.thread;

import java.util.Random;

/**
 * Created by park on 11/4/2015.
 */
public class Runner extends Thread {
    private String name;
    public Runner() {}

    public Runner(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            for(int i = 100; i > 0; i -= 10) {
                System.out.printf("%s %d 미터\n", name, i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " 골인");
    }
}
