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
public class MoveZezoToTopArray {
    static void moveZezoTop(int... arr){
        
        int counter = 0;
        
        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] != 0) {
                arr[counter] = arr[i];
                // tang bien counter
                counter++;
            }
        }
        //System.out.println(Arrays.toString(arr));
        // gan cac thanh phan con lai = 0;
        while(counter<arr.length){
            arr[counter] = 0;
            counter++;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        moveZezoTop(new int [] {12, 0, 7, 0, 8, 0, 3});
        moveZezoTop(new int [] {1, -5, 0, 0, 8, 0, 1});
    }
    
}
