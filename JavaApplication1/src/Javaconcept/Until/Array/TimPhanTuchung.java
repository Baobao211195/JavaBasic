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
public class TimPhanTuchung {
    public static void main(String[] args) {
        int a [] = {2,4,3,7,8,9};
        int b [] = {22,3,23,7,85,1};
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println( "i = " + i + "= "+ "j =" + j );
                }
            }
        }
    }
    
    
}
