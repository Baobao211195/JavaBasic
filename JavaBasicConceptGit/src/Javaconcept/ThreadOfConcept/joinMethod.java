package Javaconcept.ThreadOfConcept;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oanh
 */
public class joinMethod {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main thread started");
        final Thread t1 = new Thread() {
            public void run() {
                // thread 1
                for (int i = 0; i <= 1000; i++) {
                    System.out.println(i);
                }
                System.out.println("Number to from 0 to 1000");
            }
        };
        final Thread t2 = new Thread() {
            public void run() {
                try {
                    // thread 2
                    t1.join(5000, 500000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 1001; i <= 2000; i++) {
                    System.out.println(i);
                }
                System.out.println("Number from 1001 to 2000");
            }
        };
        Thread t3 = new Thread() {
            // thread 3
            public void run() {
                try {
                    t2.join(5000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 2001; i <= 3000; i++) {
                    System.out.println(i);
                }
                System.out.println("Number from 2001 to 3000");
            }
        };

        t3.start();
        t2.start();
        t1.start();
        t3.join();
        System.out.println("Task is finished");

    }
}
