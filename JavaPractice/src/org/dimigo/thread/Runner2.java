package org.dimigo.thread;

/**
 * Created by park on 11/4/2015.
 */
public class Runner2 implements Runnable {
    private String name;
    public Runner2() {}

    public Runner2(String name) {
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
