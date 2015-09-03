/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleJavaConcept;

import java.util.Scanner;

/**
 *
 * @author oanh
 */
public class PyramidNumberFour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua kim tu thap : ");
        int soHang = sc.nextInt();
        //  so dong 
        int rowCount = 1;
        for (int i = soHang; i > 0; i--) {
            for (int j = 1; j <= i*2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(j+" ");
            }
            for (int j = rowCount - 1; j >= 1; j--) {
                System.out.print(j+" ");
            }
            System.out.println( );
            rowCount++;

        }

    }

}
