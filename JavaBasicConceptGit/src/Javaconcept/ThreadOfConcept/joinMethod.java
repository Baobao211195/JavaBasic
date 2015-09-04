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
                for (int i = 0; i <= 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(i);
                }
                System.out.println("Number to from 0 to 10");
            }
        };
        final Thread t2 = new Thread() {
            public void run() {
                try {
                    // thread 2
                    t1.join(11000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                }
              for (int i = 11; i <= 20; i++) {  
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(i);
                }
                System.out.println("Number from 11 to 20");
            }
        };
        Thread t3 = new Thread() {
            // thread 3
            public void run() {
                try {
                    t2.join(21000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 21; i <= 30; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(joinMethod.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println(i);
                }
                System.out.println("Number from 21 to 30");
            }
        };

        t3.start();
        t2.start();
        t1.start();
        t3.join();
        System.out.println("Task is finished");

    }
}
