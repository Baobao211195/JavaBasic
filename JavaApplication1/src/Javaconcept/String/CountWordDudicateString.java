/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.String;

/**
 *dem so tu lap lai trong mot string
 * @author oanh
 */
public class CountWordDudicateString {
    static void CounterWord(String st1){
        
        String [] st2 = st1.split(" ");
        System.out.println(st2.length);
        int c= 0;
        for (String st : st2) {
            c++;
            System.out.print(st);
            
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        CounterWord(new String("pham van oanh"));
    }
}
