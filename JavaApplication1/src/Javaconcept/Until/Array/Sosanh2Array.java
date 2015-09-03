/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Until.Array;

/**
 *
 * @author oanh
 */
public class Sosanh2Array {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5};
        isqualArray(a, b);

    }

    public static boolean isqualArray(int a[], int b[]) {

        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] == b[i]) {
                    System.out.println("true");
                    return true;
                }
            }
        } else {
            return false;
        }

        return true;
    }

}
