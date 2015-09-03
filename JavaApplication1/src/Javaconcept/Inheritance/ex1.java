/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Inheritance;

/**
 *
 * @author oanh
 */
 class ex1 { 
   
    public ex1 (){
        System.out.println("Constructor of super class");
        
    }
    static {
        System.out.println("Static Block of super class");
        
    }
    // IIB
    {
             System.out.println("Innitation Block of super class");
    }
    
}
 class ex12 extends ex1{
     
     public static void main(String[] args) {
         ex12  e2 = new ex12();
     }
             
     
 }