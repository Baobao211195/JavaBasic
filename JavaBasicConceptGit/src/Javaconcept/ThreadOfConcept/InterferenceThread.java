package Javaconcept.ThreadOfConcept;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oanh
 */
class Shared {

    int i;

    void shareMethod() {
        i = 10;
        System.out.println(i);
        i = 20;
        System.out.println(i);
        i = 30;
        System.out.println(i);
    }
}

public class InterferenceThread {

    public static void main(String[] args) {
        final Shared s1 = new Shared();

        Thread t1 = new Thread() {
            public void run() {
                s1.shareMethod();
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                s1.shareMethod();
            }
        };
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(InterferenceThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        t2.start();

    }
}
