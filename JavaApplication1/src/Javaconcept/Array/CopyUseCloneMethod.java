/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Array;

/**
 *
 * @author oanh
 */
public class CopyUseCloneMethod {
    public static void main(String[] args) {
    int[] arrA = {1, 3, 4, 5, 6, 7};
    int[] arrB = arrA.clone();
    // clone() la phuong thuc ke thua tu Object class
    
        for (int b : arrB) {
            System.out.println(b + " ");
        }
    }
    
    

}
