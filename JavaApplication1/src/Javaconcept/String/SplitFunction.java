/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.String;

import java.util.Arrays;

/**
 *
 * @author oanh
 */
public class SplitFunction {
    public static void main(String[] args) {
        
        String str = "pham van   oanh    ha    nama oanh pham oanh";
        
        String [] str2 = str.split("\\s+");
        
        System.out.println(Arrays.toString(str2));
        for (String st : str2) {
            System.out.println(st);
            
        }
        for (int i = 0; i < str2.length; i++) {
            System.out.print(str2[i].toString()+ " ")  ;
        }
        
    }
    
}
