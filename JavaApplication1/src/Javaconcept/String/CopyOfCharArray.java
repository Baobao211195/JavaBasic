/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.String;

/**
 *
 * @author oanh
 */
public class CopyOfCharArray {
    
    public static void main(String[] args) {
        char ch [] = {'o','a','n','h',' ','p','v','a','o',' ','k','l','p'};
        String str = String.copyValueOf(ch); // ghep thanh 1 chuoi
        System.out.println(str);
        
        String st3 = String.copyValueOf(ch, 4  , 3); // copy tu vi tri thu 4 va co do dai = 3
        System.out.println(st3);
    }
    
}
