/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Until.Array;

import java.util.Arrays;

/**
 *
 * @author oanh
 */
public class FillMethod {
    
    public static void main(String[] args) {
        int [] arr = new int [10];
        
        Arrays.fill(arr, 3); // tat ca ca phan tu cua arr = 3
        System.out.println(Arrays.toString(arr));
        // doi vs cac kieu, string, char, ....deu nhu vay
    }
    
}
