package Javaconcept.ThreadOfConcept;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oanh
 */
class SynThread {

    int j;

    synchronized void sharedMethod() {
        Thread t = Thread.currentThread();
        for (int j = 0; j <= 10; j++) {
            System.out.println(t.getName() + " : " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(SynThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}

public class Sychronized {

    public static void main(String[] args) {
         final SynThread s1 = new SynThread();
        Thread t1 = new Thread("Thread - 1") {
            public void run() {
                s1.sharedMethod();
            }
        };
        Thread t2 = new Thread("Thread - 2 ") {
            public void run() {
                s1.sharedMethod();
            }
        };
        t1.start();
        t2.start();
    }

}
