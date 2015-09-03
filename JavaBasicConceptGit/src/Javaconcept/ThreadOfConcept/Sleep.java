package Javaconcept.ThreadOfConcept;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oanh
 */

class MyThread extends Thread{
    public MyThread (String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}
public class Sleep {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("My thread");
        t1.start();
        System.out.println("Before sleeping");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Sleep.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("After sleeping....");
        }
    
}
