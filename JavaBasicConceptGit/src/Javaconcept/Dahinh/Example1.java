/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Javaconcept.Dahinh;

/**
 *
 * @author oanh
 */
class Cha{
    public void methodCha(){
        System.out.println("Tao la cha");
    }
    
}
class Con extends Cha{
    // override
    public void methodCha(){
        System.out.println("Con thua ke cha ");
    }
}
public class Example1 {
     
    
    static void unti(Cha ch){
        ch.methodCha();
        //For each execution of this method, different objects will be passed to it.
        //which Object will be used is determined during run time only.
        //This shows dynamic polymorphism.
    }
    
    public static void main(String[] args) {
        
        Cha chaObj1 = new Cha();
        
        Con conObj1 = new Con();
        Con conObj2 = new Con();
        
        Cha chaObj2 = new Con(); // kieu cha nhung mang hinh dang cua con
        
        
//        
//        conObj1.methodCha();
//        conObj2.methodCha();
        

        unti(chaObj1);
        unti(conObj1);
        unti(chaObj2);
        
        
        
    }
}
