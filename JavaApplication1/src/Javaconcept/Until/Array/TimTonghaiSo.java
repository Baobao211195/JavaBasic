/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Until.Array;

/**
 *
 * @author tim tong hai so trong mang = 1 so cho truoc
 */
public class TimTonghaiSo {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 7, 9, 6, 5, 3, 8};

        int number = 11;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] + a[i] == number) {
                    System.out.println(a[i] + "+" + a[j] + "= " + number);
                }
            }
        }
    }

}
