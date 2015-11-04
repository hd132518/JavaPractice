package org.dimigo.thread;

/**
 * Created by park on 11/4/2015.
 */
public class Race2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner2("박건"));
        Thread t2 = new Thread(new Runner2("박준래"));
        t1.start();
        t2.start();
    }
}
