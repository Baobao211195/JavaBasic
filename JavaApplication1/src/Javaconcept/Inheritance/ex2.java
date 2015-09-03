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
public class ex2 {
    int i ;
    String strr;
    
   ex2(int i){
       System.out.println("constructor of class ex2");
   }
    
}
class ex22 extends ex2{

    public ex22(){  
      super(0);  // goi constructor cua super class tu subclass
    }
    public ex22(int i) {
        super(i); // duowc hieu la constructor mac dinh cua class A
                    // vi A ko ko co constructor mac dinh 
    }
   // int j ;
}