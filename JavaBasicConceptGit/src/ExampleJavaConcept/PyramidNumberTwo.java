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
public class PyramidNumberTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang cua kim tu thap : ");
       int soHang = sc.nextInt();
      // khoi tao rowCount = 1
       int rowCount = 1;
        for (int i = soHang; i > 0; i--) {
           // in i khoang tai diem bat dau moi hang
            for (int j = 1  ; j <= i; j++) {
                System.out.print(" ");
            }
            //Printing 'rowCount' value 'rowCount' times at the end of each row
            for (int j = 1; j <= rowCount; j++) {
                System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
        }
       
    }
}
