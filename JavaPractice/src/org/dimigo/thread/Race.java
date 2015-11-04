package org.dimigo.thread;

/**
 * Created by park on 11/4/2015.
 */
public class Race {
    public static void main(String[] args) {
        Runner r = new Runner("박건");
        Runner r2 = new Runner("박준래");

        r.setPriority(Thread.MAX_PRIORITY);
        r2.setPriority(Thread.MIN_PRIORITY);

        r.start();
        r2.start();
    }
}
