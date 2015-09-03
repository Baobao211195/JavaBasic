/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Regex;

/**
 *
 * @author oanh
 */
public class Regex1 {

    public static void main(String[] args) {
        String st = "oooa";
        boolean match = st.matches("^[o]{3}a$"); // bat dau = o, xuat hien 3 la,  ket thuc = a
        
        System.out.println(match);
    }

}
