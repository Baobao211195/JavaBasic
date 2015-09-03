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
public class CopyOf {
    public static void main(String[] args) {
        int [] arr = {2,4,5,8,9,1,5};
        int [] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));
        
        int [] arr3 = Arrays.copyOf(arr, 12); // 12 la chieu dai cua mang arr3
        System.out.println(Arrays.toString(arr3)); // cac phan tu con thieu dien 0
        
        
    }
    
}
