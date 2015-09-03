/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.ManageMemory;

/**
 *
 * @author oanh
 */
public class HeapAndStack {
    static void methodOne(){
        System.out.println("Method one");
        methodTwo();
    }
    static void methodTwo(){
        System.out.println("Method two");
    }
    public static void main(String[] args) {
        System.out.println("Main method started");
        methodOne();
        System.out.println("Main method ended");
    }
    
}
