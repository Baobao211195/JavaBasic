package Javaconcept.Quiz;

import java.util.*;

/**
 *
 * @author oanh
 */
public class Example1 {

    static int NearestNumber100(int a, int b) {

        int diff = Math.abs(100 - a);
        int diff2 = Math.abs(100 - b);

        if (diff < diff2) {
            return a;
        } else if (diff2 <  diff) {
            return b;
        } else {
            return a;
        }

    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner("System.in");

        System.out.println("Nhap so thu nhat :");
        int a = sc.nextInt();

        System.out.println("Nhap so thu hai :");
        int b = sc.nextInt();
       
       System.out.println(NearestNumber100(a, b));

    }

   

}
