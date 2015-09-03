/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Array;

import java.util.Arrays;

/**
 *
 * @author oanh
 */
public class CopyUseLoop {

    public static void main(String[] args) {

        int[] arrA = {1, 3, 4, 9, 6, 7};
        int[] arrB = new int[arrA.length];
        // copy use loop
        for (int i = 0; i < arrA.length; i++) {
            arrB[i] = arrA[i];

        }

        // in arrB
        for (int b : arrB) {
            System.out.print(b + " ");
        }
        // test sau khi copy
        System.out.println("\n" + arrA[3]);
        System.out.println(arrB[3]);
        Arrays.sort(arrB);
        for (int b : arrB) {
            System.out.print(b + " ");
        }

    }

}
