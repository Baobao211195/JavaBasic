package Javaconcept.ThreadOfConcept;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oanh
 */
class UserThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
        System.out.println("This is a user  thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
    }
}

class DeamonThread extends Thread {

    public DeamonThread() {
        setDaemon(true);

    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                System.out.println("This is a deamon thread");
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DeamonThread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

public class DeamonThreadMainTest {

    public static void main(String[] args) {
            DeamonThread deamon  = new DeamonThread();
            deamon.start();
            
            
            UserThread user = new UserThread();
            user.start();
    }

}
