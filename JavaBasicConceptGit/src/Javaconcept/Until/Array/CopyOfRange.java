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
public class CopyOfRange {
    
    public static void main(String[] args) {
        int arr [] = {3,5,9,2,0,8,4};
        int arr1 [] = Arrays.copyOfRange(arr, 3, 5); // copy tu phan tu thu 3, 4
        System.out.println(Arrays.toString(arr1));
        
        int arr2 [] = Arrays.copyOfRange(arr, 2, 5);
        System.out.println(Arrays.toString(arr2));// copy tu phan tu thu2, 3 4
        

        /// so sanh hai mang
        System.out.println(Arrays.equals(arr2, arr1));
        // tao hash code
        System.out.println(Arrays.hashCode(arr));
        
        
    }
    
    
}
